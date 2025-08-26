import java.util.Scanner;
public class Trangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length of first leg of the triangle: ");
        double legA = scanner.nextDouble();

        System.out.print("Enter Length of second leg of the triangle: ");
        double legB = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));

        System.out.println("The length of the hypotenuse of the triangle is: " + hypotenuse);

        scanner.close();
    }
}
