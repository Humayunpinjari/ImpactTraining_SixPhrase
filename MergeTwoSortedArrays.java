import java.util.*;
public class MergeTwoSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int m = sc.nextInt();

        System.out.print("Enter array 1 Elements:");
        
        int arr1[] = new int[m];
        for(int i = 0; i< m;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Array 2 size: ");
        int n = sc.nextInt();

          System.out.print("Enter array 1 Elements:");
        int arr2[] = new int[n];
        for(int i = 0; i< n;i++){
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n+m];
       int i = 0 ;  int j = 0; int k = 0;
       while( i < n && j < m){
        if(arr1[i] < arr2[j]){
            arr3[k] = arr1[i];
            i++;
        }else{
            arr3[k] = arr2[j];
            j++;
        }
        k++;
       }
      while (i < m) {
        arr3[k++] = arr1[i++];
    }

    while (j < n) {
        arr3[k++] = arr2[j++];
    }

       System.out.println("Merged Array is : "+Arrays.toString(arr3));

    }
}
