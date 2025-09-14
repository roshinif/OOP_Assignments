import java.util.Random;

class SumTask extends Thread {
    private int[] array;
    private int start, end;
    private long partialSum = 0;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class ParallelSum {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); // numbers between 0–99
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Cores: " + cores);

        SumTask[] tasks = new SumTask[cores];
        int chunkSize = size / cores;

        long startTime = System.nanoTime();

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? size : start + chunkSize;
            tasks[i] = new SumTask(numbers, start, end);
            tasks[i].start();
        }

        long totalSum = 0;
        for (SumTask task : tasks) {
            try {
                task.join();
                totalSum += task.getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // ms

        System.out.println("Parallel Sum: " + totalSum);
        System.out.println("Execution Time: " + duration + " ms");
    }
}
