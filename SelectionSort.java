import java.util.*;
public class SelectionSort {
    public static void selectionSort(int [] arr) {
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            int min =i;
            for(int j = i+1; j<n;j++){
                if(arr[j]< arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }        
    }

     public static void main(String[] args) {
        int[] array = {5, 9, 11, 2, 4, 1};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        selectionSort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
