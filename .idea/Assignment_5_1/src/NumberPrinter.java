class OddPrinter extends Thread {
    private int start, end;

    public OddPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        if (start % 2 != 0) {
            System.out.println("Odd Thread: " + start);
            start += 2;
        }
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        for (int i = start; i <= end; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

class EvenPrinter extends Thread {
    private int start, end;

    public EvenPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

public class NumberPrinter {
    public static void main(String[] args) {
        int start = 1, end = 20;

        OddPrinter oddThread = new OddPrinter(start, end);
        EvenPrinter evenThread = new EvenPrinter(2, end);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing complete.");
    }
}
