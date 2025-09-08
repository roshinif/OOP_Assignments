import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {
    public static void main(String[] args) {
        int n = 60; // Number of Fibonacci numbers
        long[] fibonacci = new long[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        String fileName = "fibonacci_sequence.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("Index,Fibonacci\n");

            for (int i = 0; i < n; i++) {
                writer.append(i + "," + fibonacci[i] + "\n");
            }

            System.out.println("Fibonacci sequence saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
