public class ThreadSafeListTest {
    public static void main(String[] args) {
        ThreadSafeList<String> list = new ThreadSafeList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                list.add("A" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                list.add("B" + i);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 30; i++) {
                list.remove("A" + i);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final list size: " + list.size());
        System.out.println("List contents: " + list.getListCopy());
    }
}
