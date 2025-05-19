import java.util.*;
public class MajortyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        int c = arr[0];
        int count = 1;
        for(int i=0;i<n;i++){
            if(count == 0){
                c = arr[i];
                count = 1;
            }else if(arr[i] == c){
                count++;
            }else{
                count--;
            }
        }
        if(count == 0){
            System.out.println("There is no Majority Element");
        }else{
            System.out.println(c);
        }
    }
}
