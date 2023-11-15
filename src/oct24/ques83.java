package oct24;

import java.util.Arrays;

public class ques83 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 9, 1, 6, 4, 7};

        separateEvenAndOdd(array);
        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(array));
    }

    private static void separateEvenAndOdd(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }

            while (left < right && array[right] % 2 != 0) {
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
