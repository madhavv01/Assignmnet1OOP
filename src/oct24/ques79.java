package oct24;

import java.util.Arrays;

public class ques79 {
    public static void main(String[] args) {
        int[] array = {12, -7, -3, -5, 6, 9, -11};

        separateNegativesAndPositives(array);
        System.out.println("Array after arranging negatives and positives: " + Arrays.toString(array));
    }

    private static void separateNegativesAndPositives(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            while (left <= right && array[left] < 0) {
                left++;
            }

            while (left <= right && array[right] >= 0) {
                right--;
            }

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
