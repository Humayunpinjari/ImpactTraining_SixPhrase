import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter arr1 Elements: ");
        int res;
        int arr1 [] = new int[n];
        for(int  i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter arr2 Elements: ");
        int arr2 [] = new int[n];
        for(int  i =0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        int rev1=0;
        int rev2=0;
        int res1=0 ;
        int res2 =0;
        for(int i=0;i<n;i++){
            rev1=(rev1*10)+arr1[i];
            res1 = rev1;
        }
        for(int i=0;i<n;i++){
            rev2=(rev2*10)+arr2[i];
            res2 = rev2;
        }
        res = res1+res2;
        // System.out.println(res);
        int fi_arr [] = new int[n];
        for(int i=0; i<n; i++){
            int rem = res%10;
            fi_arr[i] = rem;
            res = res/10;

        }
        for(int i=n-1;i>=0;i--){
        System.out.print(fi_arr[i]+ " ");
        }
        
    }

}