import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class AverageTemperature {
    public static void main(String[] args) {
        String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        double sum = 0;
        int count = 0;

        try {
            URL dataUrl = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(dataUrl.openStream()));

            String headerLine = reader.readLine();
            String[] headers = headerLine.split(";");
            int ulkoTaloIndex = -1;

            for (int i = 0; i < headers.length; i++) {
                if (headers[i].trim().equalsIgnoreCase("UlkoTalo")) {
                    ulkoTaloIndex = i;
                    break;
                }
            }

            if (ulkoTaloIndex == -1) {
                System.err.println("UlkoTalo column not found!");
                return;
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");
                if (columns.length > ulkoTaloIndex) {
                    String timestamp = columns[0];
                    if (timestamp.startsWith("01.01.2023")) { // first day of Jan 2023
                        String tempStr = columns[ulkoTaloIndex].replace(",", ".");
                        try {
                            double temp = Double.parseDouble(tempStr);
                            sum += temp;
                            count++;
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }

            reader.close();

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average UlkoTalo temperature for 01.01.2023: %.2f °C%n", average);
            } else {
                System.out.println("No data found for 01.01.2023.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
