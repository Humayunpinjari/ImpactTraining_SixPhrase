import java.util.*;
class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two range of numbers ");
        int first_value = sc.nextInt();
        int last_value = sc.nextInt();
        for(int i = first_value; i <= last_value; i++){
            int digit1 = i /10;
            int digit2 = i%10;
            int sum = digit1 + digit2;
            int product = digit1 * digit2;
            if((sum + product) == i){
                System.out.println(i);
            }
        }
    }
}