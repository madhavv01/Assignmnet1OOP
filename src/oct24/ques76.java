package oct24;

import java.util.Arrays;

public class ques76 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {4, 6, 3, 7};

        // Count and display the number of possible triangles
        int triangleCount = countTriangles(array);
        System.out.println("Number of possible triangles: " + triangleCount);
    }

    // Function to count the number of possible triangles
    private static int countTriangles(int[] array) {
        // Sorting the array for better results
        Arrays.sort(array);

        int triangleCount = 0;

        // Iterate through the array using three nested loops
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    // Check the triangle inequality
                    if (array[i] + array[j] > array[k]) {
                        // If the inequality is satisfied, all triangles with sides array[i], array[j], and array[k] are possible
                        triangleCount++;
                    } else {
                        // Since the array is sorted, if the inequality is not satisfied, further comparisons will also fail
                        break;
                    }
                }
            }
        }

        return triangleCount;
    }
}
