import java.util.Scanner;

public class OneToNine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int sum  = 1;
        for(int i = 0; i <n ;i++){
            for(int j = 0; j<n; j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
