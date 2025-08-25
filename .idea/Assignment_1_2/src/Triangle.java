import  java.util.Scanner;
public class Triangle {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length of first leg of the triangle: ");
        double lengthFirstLeg = scanner.nextDouble();

        System.out.print("Enter Length of second leg of the triangle: ");
        double lengthSecondLeg = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(lengthFirstLeg, 2) + Math.pow(lengthSecondLeg, 2));

        System.out.println("The length of the hypotenuse of the triangle is: " + hypotenuse);

        scanner.close();
    }

}