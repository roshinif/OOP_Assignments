import java.util.Scanner;

public class SolveQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient A: ");
        double coefficientA = scanner.nextDouble();

        System.out.print("Enter coefficient B: ");
        double coefficientB = scanner.nextDouble();

        System.out.print("Enter coefficient C: ");
        double coefficientC = scanner.nextDouble();

        double sqrtpart = coefficientB * coefficientB - 4 * coefficientA * coefficientC;

        if (sqrtpart > 0) {
            double firstRoot = (-coefficientB + Math.sqrt(sqrtpart)) / (2 * coefficientA);
            double secondRoot = (-coefficientB - Math.sqrt(sqrtpart)) / (2 * coefficientA);
            System.out.println("Root 1: " + firstRoot + "  Root 2: " + secondRoot);
        }
        else if (sqrtpart == 0) {
            double singleRoot = -coefficientB / (2 * coefficientA);
            System.out.println("Root: " + singleRoot);
        }
        else {
            System.out.println("No real root");
        }

        scanner.close();
    }
}
