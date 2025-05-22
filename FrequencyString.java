import java.util.*;

public class FrequencyString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Word: ");
    String word = sc.nextLine();

    int frequency = 0;

    for (int i = 0; i < word.length(); i++) {
      char ch = Character.toLowerCase(word.charAt(i)); 
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        frequency++;
      }
    }

    System.out.println("Number of vowels in the word: " + frequency);
  }
}
