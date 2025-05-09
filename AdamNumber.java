import java.util.*;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int revNum = 0;

        // Reverse the original number
       	int reversed = 0;
        int tempOriginal = original; // preserve original number for later use
	

        // Square the original and reversed numbers
        int square = n * n;
        int squareRevNum = revNum * revNum;

        // Reverse the square of the original number
        int revSquare = 0;
        int temp = square; // use a temp variable to avoid changing the original square
        while (temp > 0) {
            revSquare = revSquare * 10 + temp % 10;
            temp /= 10;
        }

        // Compare the values
        if (revSquare == squareRevNum) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }

        sc.close();
    }
}