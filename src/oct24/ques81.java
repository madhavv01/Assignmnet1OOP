package oct24;

import java.util.Arrays;

public class ques81 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 8, 2, 9, 1, 6};

        // Sort and arrange the elements alternately
        sortMaxMinAlternate(array);

        // Display the result
        System.out.println("Array after sorting and rearranging: " + Arrays.toString(array));
    }

    // Function to sort an array and arrange the elements alternately
    private static void sortMaxMinAlternate(int[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);

        int[] resultArray = new int[array.length];
        int left = 0;
        int right = array.length - 1;

        // Arrange the elements alternately
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                resultArray[i] = array[right];
                right--;
            } else {
                resultArray[i] = array[left];
                left++;
            }
        }

        // Copy the result array back to the original array
        System.arraycopy(resultArray, 0, array, 0, array.length);
    }
}
