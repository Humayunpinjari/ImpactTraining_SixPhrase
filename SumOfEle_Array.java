
import java.util.*;
public class SumOfEle_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int sum = 0;
        int size = sc.nextInt();
        
        int []arr = new int[size];
        System.out.print("Enter elements: ");
        
        for(int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            // System.out.print(arr[i] + " ");
            
            
        }
        System.out.println("Sum is : " + sum);
            
    }
}

