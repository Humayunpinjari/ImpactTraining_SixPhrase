import java.util.*;

public class BubbleSort {
    
    // Bubble Sort Logic
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {5, 9, 11, 2, 4, 1};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        bubbleSort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
