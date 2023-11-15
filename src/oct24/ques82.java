package oct24;

import java.util.Arrays;

public class ques82 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 1, 0};

        separateZerosAndOnes(array);
        System.out.println("Array after separating 0s and 1s: " + Arrays.toString(array));
    }

    private static void separateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && array[left] == 0) {
                left++;
            }

            while (left < right && array[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }
}
