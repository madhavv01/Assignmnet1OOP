package oct24;

import java.util.Arrays;

public class ques72 {
    public static void main(String[] args) {
        // Sample array with duplicate elements
        int[] array = {20, 20, 30, 40, 50, 50, 50};

        // Remove duplicates and get the updated array length
        int updatedLength = removeDuplicates(array);

        // Display the result
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Updated array after removing duplicates: " + Arrays.toString(Arrays.copyOf(array, updatedLength)));
        System.out.println("Updated array length: " + updatedLength);
    }

    // Function to remove duplicates from an array and return the updated length
    private static int removeDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array.length; // No duplicates to remove
        }

        // Sort the array to group duplicate elements together
        Arrays.sort(array);

        // Initialize the updated length and the last unique element
        int updatedLength = 1;
        int lastUniqueElement = array[0];

        // Iterate through the sorted array to find unique elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] != lastUniqueElement) {
                array[updatedLength] = array[i];
                lastUniqueElement = array[i];
                updatedLength++;
            }
        }

        return updatedLength;
    }
}
