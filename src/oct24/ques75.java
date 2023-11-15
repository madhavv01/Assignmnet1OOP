package oct24;

import java.util.Arrays;

public class ques75 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int targetSum = 20;

        findCombinations(array, targetSum);
    }

    private static void findCombinations(int[] array, int targetSum) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 3; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                for (int k = j + 1; k < array.length - 1; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        int currentSum = array[i] + array[j] + array[k] + array[l];

                        if (currentSum == targetSum) {
                            System.out.println("Combination: [" + array[i] + ", " + array[j] + ", " + array[k] + ", " + array[l] + "]");
                        }
                    }
                }
            }
        }
    }
}
