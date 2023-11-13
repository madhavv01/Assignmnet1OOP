package oct24;

import java.util.Arrays;

public class ques77 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Cyclically rotate the array clockwise by one
        cyclicRotateArray(array);

        // Display the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    // Function to cyclically rotate a given array clockwise by one
    private static void cyclicRotateArray(int[] array) {
        if (array.length <= 1) {
            // No rotation needed for arrays with 0 or 1 elements
            return;
        }

        // Store the last element to be moved to the first position
        int lastElement = array[array.length - 1];

        // Shift each element to the right by one position
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Move the last element to the first position
        array[0] = lastElement;
    }
}
