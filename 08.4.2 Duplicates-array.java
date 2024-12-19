QUE : Duplicates in an Array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Method to find duplicates
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        /*
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;  // Get the index corresponding to the value
            if (arr[index] < 0) {
                // If the value at the index is negative, it means this number has appeared before
                result.add(Math.abs(arr[i]));
            } else {
                // Mark the number as visited by negating the value at that index
                arr[index] = -arr[index];
            }
        }
        
        return result;
    }
      */
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value < 0) {
                value = -value; // Convert to positive manually
            }
            
            int index = value - 1; // Get the corresponding index
            
            if (arr[index] < 0) {
                // If the value at the index is negative, this number is a duplicate
                result.add(index + 1);
            } else {
                // Mark the number as visited by negating the value at the index
                arr[index] = -arr[index];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Declare and take input for the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (between 1 and " + n + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find and print the duplicates
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + duplicates);
        
        scanner.close();
    }
}



INPUT :
          6
          -7
          2
          4
          6
          7
          2
OUTPUT :
        [7, 2]
  ------------------------------------------------------------------------------------
