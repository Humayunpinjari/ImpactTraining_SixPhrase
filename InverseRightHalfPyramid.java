import java.util.Scanner;

public class InverseRightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int i = 1; i <=n ;i++){
            for(int j = i; j<=n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}