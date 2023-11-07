package oct24;
public class ques68 {

    public static void main(String[] args) {
        int[] arr = {12, 4, 8, 15, 7, 10};

        double average = computeAverageExceptMinMax(arr);

        if (average != -1) {
            System.out.println("The average value (excluding min and max) is: " + average);
        } else {
            System.out.println("Array must have a length of at least 3.");
        }
    }

    public static double computeAverageExceptMinMax(int[] arr) {
        if (arr.length < 3) {
            return -1; // Indicates that the array must have a length of at least 3
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
            count++;
        }

        return (double) (sum - min - max) / (count - 2);
    }
}
