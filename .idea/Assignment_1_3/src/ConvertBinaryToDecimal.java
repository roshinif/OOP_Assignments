import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;
        int no_bits = binary.length();

        for(int i=0; i<no_bits; i++){
            char bit = binary.charAt(i);

            int digit = bit - '0';

            decimal = decimal * 2 + digit;

        }

        System.out.println("Decimal value: " + decimal);
    }
}

