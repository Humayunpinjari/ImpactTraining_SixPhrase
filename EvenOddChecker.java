

import java.util.Scanner;
import java.util.InputMismatchException;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  // Attempt to read an integer
             
            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is even.");  // Even if divisible by 2
            } else {
                System.out.println(number + " is odd.");   // Otherwise, it's odd
            }
        } catch (InputMismatchException e) {
            // This block catches non-integer inputs
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // This block always executes
            System.out.println("Program has ended.");  
            scanner.close();  // Close the scanner
        }
    }
}

