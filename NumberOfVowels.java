import java.util.*;

public class NumberOfVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Word: ");
    String word = sc.nextLine();

    String vowels = "aeiouAEIOU"; // all vowels
    int frequency = 0;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (vowels.indexOf(ch) != -1) {
        frequency++;
      }
    }

    System.out.println("Number of vowels in the word: " + frequency);
  }
}
