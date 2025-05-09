import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int binary = 0;
        int power = 1; // This keeps track of place value (1, 10, 100, ...)

        int originalNum = num; // Store the original number for display

        // Convert decimal to binary without using strings
        while (num > 0) {
            int bit = num % 2;          // Get the remainder (0 or 1)
            binary += bit * power;      // Add to the binary number
            power *= 10;                // Shift place value left
            num = num / 2;              // Reduce the number
        }

        System.out.println("Binary representation of " + originalNum + " is: " + binary);
    }
}
