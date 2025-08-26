import java.util.Scanner;
public class Measure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight in grams: ");
        double weightInGrams = scanner.nextDouble();

        double leiviskä = Math.floor(weightInGrams / (13.28 * 32 * 20));
        double naula = Math.floor((weightInGrams / (13.28 * 32 * 20) - leiviskä) * 20);
        double luoti = (((weightInGrams / (13.28 * 32 * 20) - leiviskä) * 20) - naula) * 32;

        System.out.printf("%.0f gram is %.0f leiviska, %.0f of naula, and %.2f luoti.", weightInGrams, leiviskä, naula, luoti);

        scanner.close();
    }
}
