import java.util.*;
public class OnlineGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int arr [] = new int[n];

            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();

                
            }
            int left = 0;
                int right= n-1;
                
            while(left<right){
                if(arr[left]%2 == 0){
                    left++;
                }else if(arr[right]%2 != 0){
                    right--;
                }else{
                    int temp = arr[left];
                    arr[left] = arr[right];
                }
            }
            for(int i = 0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
