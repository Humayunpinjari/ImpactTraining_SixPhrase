import java.util.Scanner;

public class InverseLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int i = 1; i <=n ;i++){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
