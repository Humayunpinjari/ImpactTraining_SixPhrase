
import java.util.*;
class Accen_Divi_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int m = sc.nextInt();
        
        int lowerMultiple = (number/m)*m;
        int upperMultiple = lowerMultiple + m;
        
        int distToLower = Math.abs(number - lowerMultiple);
        int distToUpper = Math.abs(number - upperMultiple);
        
        int result = (distToLower < distToUpper) ? lowerMultiple : upperMultiple;
        
        System.out.println(result);
    }
}