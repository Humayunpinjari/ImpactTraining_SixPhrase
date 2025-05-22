import java.util.Scanner;

public class StringPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    if (str.equalsIgnoreCase(reversed)) {
      System.out.println("Yes! It's a palindrome.");
    } else {
      System.out.println("Nope! Not a palindrome.");
    }
  }
}
