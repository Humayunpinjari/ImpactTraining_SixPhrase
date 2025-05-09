import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit:");
        int digit = sc.nextInt();
        if(digit == 0){
            System.out.println("ZERO(0)");
        }else if(digit % 2 == 0){
            System.out.println("EVEN DIGIT");
        }else if(digit % 2 != 0){
            System.out.println("ODD DIGIT");
        }else {
            System.out.println("NOT A DIGIT");
        }
    }
}
