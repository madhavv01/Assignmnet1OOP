package oct24;

import java.util.Arrays;

public class ques84 {
    public static void main(String[] args) {
        // Sample array of integers
        int[] array = {6, 7, 4, 3, 8, 2, 9};

        // Replace elements with the next greatest element and display the result
        replaceWithNextGreatest(array);
        System.out.println("Array after replacing with next greatest elements: " + Arrays.toString(array));
    }

    // Function to replace each element with the next greatest element
    private static void replaceWithNextGreatest(int[] array) {
        int n = array.length;
        int maxFromRight = array[n - 1];
        array[n - 1] = -1; // Replace the last element with -1

        // Iterate from the second-to-last element to the first element
        for (int i = n - 2; i >= 0; i--) {
            int currentElement = array[i];
            // Store the current element and update it with the current maxFromRight
            array[i] = maxFromRight;

            // Update maxFromRight if the current element is greater
            if (currentElement > maxFromRight) {
                maxFromRight = currentElement;
            }
        }
    }
}
