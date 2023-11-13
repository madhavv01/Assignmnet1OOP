package oct24;

import java.util.Arrays;

public class ques83 {
    public static void main(String[] args) {
        // Sample array of integers
        int[] array = {5, 8, 2, 9, 1, 6, 4, 7};

        // Separate even and odd numbers and display the result
        separateEvenAndOdd(array);
        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(array));
    }

    // Function to separate even and odd numbers
    private static void separateEvenAndOdd(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Find the first odd number from the left
            while (left < right && array[left] % 2 == 0) {
                left++;
            }

            // Find the first even number from the right
            while (left < right && array[right] % 2 != 0) {
                right--;
            }

            // Swap the even and odd numbers
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }
}
