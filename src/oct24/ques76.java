package oct24;

import java.util.Arrays;

public class ques76 {
    public static void main(String[] args) {
        int[] array = {4, 6, 9, 3, 7};

        int triangleCount = countTriangles(array);
        System.out.println("Number of possible triangles: " + triangleCount);
    }

    private static int countTriangles(int[] array) {
        Arrays.sort(array);

        int triangleCount = 0;

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] > array[k]) {
                        triangleCount++;
                    } else {
                        break;
                    }
                }
            }
        }

        return triangleCount;
    }
}
