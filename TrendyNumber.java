import java.util.Scanner;
class TrendyNumber{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        
        if (number % 3 == 0){
            System.out.println("Trendy Number");
        }else{
            System.out.println("Not a Trendy Number");
        }
    }
}