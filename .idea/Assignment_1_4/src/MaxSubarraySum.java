import java.util.Scanner;

public class MaxSubarraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];

        System.out.println("Enter array elements:");
        for (int index = 0; index < arraySize; index++){
            numbers[index] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0, endIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            int currentSum = 0;
            for (int j = i; j < arraySize; j++) {
                currentSum += numbers[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("Max sum: " + maxSum);
        System.out.println("Subarray indices: " + (startIndex + 1) + "-" + (endIndex + 1));
    }
}
