package oct24;

import java.util.Arrays;

public class ques82 {
    public static void main(String[] args) {
        // Sample array of 0s and 1s
        int[] array = {0, 1, 0, 1, 1, 0, 1, 0};

        // Separate 0s and 1s and display the result
        separateZerosAndOnes(array);
        System.out.println("Array after separating 0s and 1s: " + Arrays.toString(array));
    }

    // Function to separate 0s to the left and 1s to the right
    private static void separateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Find the first 1 from the left
            while (left < right && array[left] == 0) {
                left++;
            }

            // Find the first 0 from the right
            while (left < right && array[right] == 1) {
                right--;
            }

            // Swap the 0 and 1 elements
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }
}
