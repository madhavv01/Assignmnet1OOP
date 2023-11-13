package oct24;

import java.util.HashMap;

public class ques74 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 4, 5, 6};

        // Target value
        int targetValue = 6;

        // Find and display the pair of elements whose sum equals the target value
        findSumPair(array, targetValue);
    }

    // Function to find and display the pair of elements whose sum equals the target value
    private static void findSumPair(int[] array, int targetValue) {
        // Create a HashMap to store the difference between the target value and each element
        HashMap<Integer, Integer> differenceMap = new HashMap<>();

        // Iterate through the array to find the pair
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int difference = targetValue - currentElement;

            // Check if the difference is present in the map
            if (differenceMap.containsKey(difference)) {
                // Found a pair
                int index = differenceMap.get(difference);

                System.out.println("Pair of elements whose sum equals the target value:");
                System.out.println("Element 1: " + array[index] + " at index " + index);
                System.out.println("Element 2: " + currentElement + " at index " + i);

                return; // Stop after finding the first pair
            }

            // Store the current element and its index in the map
            differenceMap.put(currentElement, i);
        }

        // If no pair is found
        System.out.println("No pair found with the given sum in the array.");
    }
}
