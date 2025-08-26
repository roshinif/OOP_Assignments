import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int arrayLength = scanner.nextInt();
        int[] inputNumbers = new int[arrayLength];

        System.out.println("Please enter the integers in the array: :");
        for (int numIndex = 0; numIndex < arrayLength; numIndex++) {
            inputNumbers[numIndex] = scanner.nextInt();
        }

        int[] uniqueNumbers = new int[arrayLength];
        int uniqueCount = 0;

        for (int outerIndex = 0; outerIndex < arrayLength; outerIndex++) {
            boolean isDuplicate = false;
            for (int innerIndex = 0; innerIndex < uniqueCount; innerIndex++) {
                if (inputNumbers[outerIndex] == uniqueNumbers[innerIndex]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount++] = inputNumbers[outerIndex];
            }
        }

        System.out.print("The unique numbers in your array are: ");
        for (int displayIndex = 0; displayIndex < uniqueCount; displayIndex++) {
            System.out.print(uniqueNumbers[displayIndex] + " ");
        }
    }
}
