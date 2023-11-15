package oct24;

import java.util.Arrays;

public class ques81 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 9, 1, 6};

        sortMaxMinAlternate(array);

        System.out.println("Array after sorting and rearranging: " + Arrays.toString(array));
    }

    private static void sortMaxMinAlternate(int[] array) {
        Arrays.sort(array);

        int[] resultArray = new int[array.length];
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                resultArray[i] = array[right];
                right--;
            } else {
                resultArray[i] = array[left];
                left++;
            }
        }

        System.arraycopy(resultArray, 0, array, 0, array.length);
    }
}
