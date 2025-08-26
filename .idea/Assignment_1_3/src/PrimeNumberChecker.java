import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Type the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean primeCheck = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        primeCheck = false;
                        break;
                    }
                }
                if (primeCheck) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}


