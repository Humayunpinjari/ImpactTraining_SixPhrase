import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int number = sc.nextInt();
        int reversed = 0;
        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        System.out.print("Reversed Number: "+ reversed);
    }
}
