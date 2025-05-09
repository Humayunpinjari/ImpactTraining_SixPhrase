import java.util.Scanner;
class SumOfThree
 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number :");
        int x = sc.nextInt();
        int last = x % 10;
        int middle = (x / 10)%10;
        int first = x /100;
        
        System.out.println(first + middle + last);
    }
}