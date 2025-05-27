import java.util.*;

public class Factorial {

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args){
        int number = 10;
        int result = factorial(number);
        System.out.print("Factorial is " + result);
    }
}
