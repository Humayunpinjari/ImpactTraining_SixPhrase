import java.util.*;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int k = sc.nextInt();

        int square = k * k;

        // Count number of digits in the original number
        int d = 0;
        int temp = k;
        while (temp > 0) {
            d++;
            temp /= 10;
        }
        
         // Get the divisor to split the square
        // int divisor = (int)Math.pow(10, d);
        
        // Calculate divisor = 10^d without using Math.pow
        int divisor = 1;
        for (int i = 0; i < d; i++) {
            divisor *= 10;
        }

        // Split the square into two parts
        int right = square % divisor;
        int left = square / divisor;

        // Check if it's a Kaprekar number
        if (right + left == k)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");

        sc.close();
    }
}

