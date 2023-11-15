package oct24;

import java.util.Arrays;

public class ques84 {
    public static void main(String[] args) {
        int[] array = {6, 7, 4, 3, 8, 2, 9};

        replaceWithNextGreatest(array);
        System.out.println("Array after replacing with next greatest elements: " + Arrays.toString(array));
    }

    private static void replaceWithNextGreatest(int[] array) {
        int n = array.length;
        int maxFromRight = array[n - 1];
        array[n - 1] = -1; 
        for (int i = n - 2; i >= 0; i--) {
            int currentElement = array[i];
            array[i] = maxFromRight;

            if (currentElement > maxFromRight) {
                maxFromRight = currentElement;
            }
        }
    }
}
