import java.util.*;
public class SmallestMissingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alphabets.length(); i++){
            char ch = alphabets.charAt(i);
            if(s.indexOf(ch) ==-1){
                System.out.println("Smallest Missing Character is "+ch);
                break;
            }
        }
    }
}
