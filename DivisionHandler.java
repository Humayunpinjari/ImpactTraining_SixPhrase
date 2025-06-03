import java.util.*;

public class DivisionHandler {
    public static void main(String[] args) {
        try {
            System.out.println("Enter numerator: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println("Enter denominator: ");
            int den = scanner.nextInt();
            int result = num / den;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (Exception e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Division operation Completed");
        }
    }
}

// WAP using exceptional handling to check a given number is even or odd in java