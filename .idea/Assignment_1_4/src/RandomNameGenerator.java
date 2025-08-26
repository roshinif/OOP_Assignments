import java.util.Scanner;

public class RandomNameGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNameList = { "Alice", "Bob", "Charlie", "Diana" };
        String[] lastNameList = { "Smith", "Johnson", "Brown", "Taylor" };

        System.out.print("Enter the number of random names to generate: ");
        int numberOfNames = scanner.nextInt();

        System.out.println("  ");
        System.out.println("Generated Names: ");

        for (int count = 0; count < numberOfNames; count++) {
            int firstNameIndex = (int) (Math.random() * firstNameList.length);
            int lastNameIndex = (int) (Math.random() * lastNameList.length);

            String selectedFirstName = firstNameList[firstNameIndex];
            String selectedLastName = lastNameList[lastNameIndex];

            System.out.println((count + 1) + ". " + selectedFirstName + " " + selectedLastName);
        }

        scanner.close();
    }
}
