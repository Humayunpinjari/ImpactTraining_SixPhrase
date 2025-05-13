// COGNIZANT QUESTION

import java.util.*;

public class PersonHeightWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Persons: ");
        int n = sc.nextInt();

        int array[] = new int[n * 2];  // Store height and weight pairs
        System.out.println("Enter the height and weight for each person:");
        for (int i = 0; i < n * 2; i++) {
            array[i] = sc.nextInt();
        }

        int max_h = 0; // Assume all heights are positive; otherwise, use Integer.MIN_VALUE
        int max_w = 0; // Assume all weights are positive; otherwise, use Integer.MIN_VALUE
        int max_h_i = -1; // Initialized to -1 to indicate not found yet
        int max_w_i = -1;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) { // even index -> height
                if (array[i] > max_h) {
                    max_h = array[i];
                    max_h_i = i;
                }
            } else { // odd index -> weight
                if (array[i] > max_w) {
                    max_w = array[i];
                    max_w_i = i;
                }
            }
        }

        System.out.println("Maximum Height: " + max_h);
        System.out.println("Person with maximum Height: Person " + ((max_h_i / 2) + 1));

        System.out.println("Maximum Weight: " + max_w);
        System.out.println("Person with maximum Weight: Person " + ((max_w_i / 2) + 1));
    }
}
