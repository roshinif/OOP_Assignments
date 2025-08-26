import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number:");
        int startNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the end number:");
        int endNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Prime numbers between " + startNumber + " and " + endNumber + ":");

        for (int currentNumber = startNumber; currentNumber <= endNumber; currentNumber++) {
            if (currentNumber > 1) {
                boolean isPrime = true;

                for (int divisor = 2; divisor <= currentNumber / 2; divisor++) {
                    if (currentNumber % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(currentNumber + " ");
                }
            }
        }
    }
}
