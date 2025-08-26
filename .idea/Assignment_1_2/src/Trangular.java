import java.util.Scanner;
public class Trangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangle: ");
        double firstLeg = scanner.nextDouble();

        System.out.print("Enter the length of the second side of the triangle: ");
        double secondLeg = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));

        System.out.println("The length of the hypotenuse of the triangle is: " + hypotenuse);

        scanner.close();
    }
}
