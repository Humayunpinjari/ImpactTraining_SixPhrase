import java.util.Scanner;
public class HarryPotterCode {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = num.nextInt();
        int a = x/1000;
        int b = x % 10;
        System.out.println(a + b);
        
    }
}