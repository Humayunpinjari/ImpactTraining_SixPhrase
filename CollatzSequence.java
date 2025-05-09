import java.util.*;
class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int counter = 0;
        while(number > 1){
            if(number % 2 == 0){
                number = number /2;
                
            }else{
                number = (number * 3)+1;
            }
            counter++;
            System.out.println(number);
        }
    }
}