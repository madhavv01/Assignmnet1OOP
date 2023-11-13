package oct24;

import java.util.HashSet;

public class ques73 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};

        // Find the length of the longest consecutive sequence
        int longestLength = longestConsecutiveSequenceLength(array);

        // Display the result
        System.out.println("Sample array: " + java.util.Arrays.toString(array));
        System.out.println("Length of the longest consecutive sequence: " + longestLength);
    }

    // Function to find the length of the longest consecutive sequence
    private static int longestConsecutiveSequenceLength(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Initialize variables for the result
        int longestStreak = 0;

        // Iterate through the array to find the longest consecutive sequence
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
