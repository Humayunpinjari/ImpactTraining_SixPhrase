import java.util.*;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr1: ");
        int m = sc.nextInt();

        System.out.print("Enter array 1 Elements: ");
        int arr1[] = new int[m];
        for(int i=0; i<m;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of arr2: ");
        int n = sc.nextInt();

        System.out.print("Enter array 2 Elements: ");
        int arr2[] = new int[n];
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        int arr3 [] = new int[m+n];

        int i=0; int j = 0; int k = 0;
        while (i < m && j < n){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr3[k++] = arr1[i++];
        }
        while(j<n){
            arr3[k++] = arr2[j++];
        }
        // System.out.println(Arrays.toString(arr3));


        int length = m + n;
        if(length %2 ==0){
            double median = (arr3[length / 2 - 1] + arr3[length / 2]) / 2.0;
            System.out.println("Median will be: "+median);
        }
        else{
            System.out.println("Median will be: " + arr3[length / 2]);
        }
    }
}
