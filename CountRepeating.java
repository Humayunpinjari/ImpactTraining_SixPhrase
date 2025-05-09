import java.util.*;
public class CountRepeating {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number and m:");
       int number = sc.nextInt();
       int m = sc.nextInt();
       int count = 0;
       while(number  != 0){
           int r = number % 10;
           if(r == m){
               count+=1;
           }
           number = number/10;
       }
       System.out.println(count);
    }
}