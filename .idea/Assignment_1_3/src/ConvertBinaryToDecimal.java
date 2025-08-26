import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a binary number: ");
        String binaryInput = scanner.nextLine();

        int decimalValue = 0;
        int lengthOfBinary = binaryInput.length();

        for(int index = 0; index < lengthOfBinary; index++){
            char currentBit = binaryInput.charAt(index);

            int bitValue = currentBit - '0';

            decimalValue = decimalValue * 2 + bitValue;
        }

        System.out.println("Decimal value: " + decimalValue);
    }
}
