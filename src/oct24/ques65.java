package oct24;
public class ques65 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5, 0, 8, 0};

        moveZerosToEnd(arr);

        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Iterate through the array, moving non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }
}
