package oct24;

import java.util.Arrays;

public class ques75 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Target sum value
        int targetSum = 20;

        // Find and display all combinations of four elements whose sum equals the target value
        findCombinations(array, targetSum);
    }

    // Function to find and display all combinations of four elements whose sum equals the target value
    private static void findCombinations(int[] array, int targetSum) {
        // Sorting the array for better results
        Arrays.sort(array);

        // Iterate through all combinations using four nested loops
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                for (int k = j + 1; k < array.length - 1; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        int currentSum = array[i] + array[j] + array[k] + array[l];

                        // Check if the current combination equals the target sum
                        if (currentSum == targetSum) {
                            // Display the combination
                            System.out.println("Combination: [" + array[i] + ", " + array[j] + ", " + array[k] + ", " + array[l] + "]");
                        }
                    }
                }
            }
        }
    }
}
