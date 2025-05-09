import java.util.*;

public class ArraysSameOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array 1 size: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        int sum1 = 0;
        
        System.out.println("Enter elements of array 1: ");
        for(int i = 0; i<size1; i++){
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
        }
        
        System.out.print("Enter array 2size: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        int sum2 = 0;
        
        System.out.println("Enter elements of array 2: ");
        for(int i = 0; i<size2; i++){
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }
        if(size1 == size2 && sum1 == sum2){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
        
    }
}

