
import java.util.*;
public class QueueBusStop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of batches: ");
        int length = sc.nextInt();

        System.out.print("Enter the seating Capacity: ");
        int capacity = sc.nextInt();

        System.out.print("Enter the Elements of your length: ");
        int arr[] = new int[length];
        for(int i = 0; i< length; i++){
            arr[i] = sc.nextInt();
        }
        int currentCapacity = 0;
        int busCount = 1;

        for(int i= 0; i< length; i++){
            if(currentCapacity + arr[i] <= capacity){
                currentCapacity += arr[i];
            }else{
                busCount++;
                currentCapacity = arr[i];
            }
        }
        System.out.println(busCount);


    }
}
