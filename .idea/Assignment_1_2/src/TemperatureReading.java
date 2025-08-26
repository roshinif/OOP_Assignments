import java.util.Scanner ;
public class TemperatureReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the temperature (°F): ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The temperature now is %.1f °C%n", celsius);

        scanner.close();
    }
}