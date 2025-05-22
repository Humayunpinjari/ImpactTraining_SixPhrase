import java.util.*;
public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        int n = s.length();
        boolean found = false;
        for(int i=0; i<n;i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println(ch);
                found = true;
                break;
            }
        }   if(found!=true){
            System.out.println("No Repeating Characters....");
        }             
             
    }
}
