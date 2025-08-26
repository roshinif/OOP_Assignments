import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input total elements: ");
        int total = scan.nextInt();
        int[] rawData = new int[total];

        System.out.println("Input numbers sequentially: ");
        for (int a = 0; a < total; a++) {
            rawData[a] = scan.nextInt();
        }

        int[] filtered = new int[total];
        int count = 0;

        for (int x = 0; x < total; x++) {
            boolean exists = false;
            for (int y = 0; y < count; y++) {
                if (rawData[x] == filtered[y]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                filtered[count++] = rawData[x];
            }
        }

        System.out.println("Filtered numbers without repetition: ");
        for (int z = 0; z < count; z++) {
            System.out.print(filtered[z] + " ");
        }
    }
}
