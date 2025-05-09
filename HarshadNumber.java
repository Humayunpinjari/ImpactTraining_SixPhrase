import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number:");
       int number = sc.nextInt();
       int sum = 0;
       int temp = number;
       while(number  != 0){
           int r = number % 10;
           sum  = sum + r;
           number = number / 10;
       }
       System.out.println("Sum is : " +sum);
       if(temp % sum  == 0){
           System.out.println("Harshad Number");
       }else{
           System.out.println("Not Harshad Number");
       }
    }
}