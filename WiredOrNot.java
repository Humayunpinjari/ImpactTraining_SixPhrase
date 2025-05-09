import java.util.Scanner;
class WiredOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number/ digit:");
        int number = sc.nextInt();
        
        if(number % 2 != 0){
            System.out.println("Wired");
        }else if((number % 2 == 0) && (number <=5 && number >= 2 )){
            System.out.println("Wired");
        }
        else if ((number % 2 == 0) && (number <=20 && number >= 6)){
            System.out.println("Wired");
        }else if((number % 2 == 0) && (number >20)){
            System.out.println("Not Wired");
        }else{
            System.out.println("Invalid");
        }
    }
}