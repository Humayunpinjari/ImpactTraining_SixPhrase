import java.util.*;
public class GoodInteger {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int [] A = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<n;i++){
            int z = A[i];

            int limit = (int) Math.cbrt(z) +1;

            for (int x=1; x < limit; x++){
                int x3 = (int) Math.pow(x,3);

                for (int y = x+ 1; y < limit; y++){
                    int y3 = (int) Math.pow(y,3);

                    if (x3 + y3 == z){
                        count++;
                        break;
                    }
                }

        }
    }

    System.out.println("Count of Good Integers:"+count);

}
}
