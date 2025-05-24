import java.util.Scanner;

public class SwapDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        String numStr = Integer.toString(n);
        int len = numStr.length();

        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = numStr.charAt(i) - '0';
        }

        // Swapping adjacent digits
        for (int i = 0; i < len - 1; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        // Reconstruct the number
        int result = 0;
        for (int i = 0; i < len; i++) {
            result = result * 10 + a[i];
        }

        System.out.println(result);
        sc.close();
    }
}
