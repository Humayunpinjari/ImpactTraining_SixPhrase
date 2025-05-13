import java.util.*;
public class ArrayInsertion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter elements: ");

        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();

        if(pos > size){
            System.out.println("Invalid");
        }else{
            System.out.print("Enter the element: ");
            int Element = sc.nextInt();
            for(int i = 0; i < size; i++){
                if(i == pos-1){
                    System.out.println(Element);
                }
                System.out.println(arr[i]);
            }

        }

    }
}