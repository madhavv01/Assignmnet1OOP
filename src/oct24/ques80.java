package oct24;

import java.util.Arrays;

public class ques80 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {12, -7, -3, -5, 6, 9, -11};

        // Arrange the elements and display the result
        separatePositivesAndNegatives(array);
        System.out.println("Array after arranging positives and negatives: " + Arrays.toString(array));
    }

    // Function to arrange the elements so that positives appear before negatives
    private static void separatePositivesAndNegatives(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // Find the first negative element from the left
            while (left <= right && array[left] >= 0) {
                left++;
            }

            // Find the first positive element from the right
            while (left <= right && array[right] < 0) {
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
