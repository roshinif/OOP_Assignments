import java.util.ArrayList;

class ThreadSafeList<T> {
    private ArrayList<T> list;

    public ThreadSafeList() {
        list = new ArrayList<>();
    }

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized boolean remove(T element) {
        return list.remove(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized ArrayList<T> getListCopy() {
        return new ArrayList<>(list);
    }
}
