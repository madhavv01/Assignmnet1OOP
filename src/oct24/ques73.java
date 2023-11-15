package oct24;

import java.util.HashSet;

public class ques73 {
    public static void main(String[] args) {
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};

        int longestLength = longestConsecutiveSequenceLength(array);

        System.out.println("Sample array: " + java.util.Arrays.toString(array));
        System.out.println("Length of the longest consecutive sequence: " + longestLength);
    }

    private static int longestConsecutiveSequenceLength(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int longestStreak = 0;

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
