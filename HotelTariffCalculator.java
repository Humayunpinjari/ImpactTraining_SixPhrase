
import java.util.Scanner;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        int month = scanner.nextInt();
        int roomRent = scanner.nextInt();
        int numberOfDays = scanner.nextInt();

        // Check if the month is valid
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
        } else {
            // Calculate base tariff
            double totalTariff = roomRent * numberOfDays;

            // Check for peak season months
            if (month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
                totalTariff += totalTariff * 0.20; // Add 20%
            }

            // Print final tariff (no decimal places)
            System.out.println((int) totalTariff);
        }

        scanner.close();
    }
}
