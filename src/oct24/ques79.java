package oct24;

import java.util.Arrays;

public class ques79 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {12, -7, -3, -5, 6, 9, -11};

        // Arrange the elements and display the result
        separateNegativesAndPositives(array);
        System.out.println("Array after arranging negatives and positives: " + Arrays.toString(array));
    }

    // Function to arrange the elements so that negatives appear before positives
    private static void separateNegativesAndPositives(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // Find the first positive element from the left
            while (left <= right && array[left] < 0) {
                left++;
            }

            // Find the first negative element from the right
            while (left <= right && array[right] >= 0) {
                right--;
            }

            // Swap the positive and negative elements
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }
    }
}
