package oct24;
public class ques66 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = countEvenOdd(arr);

        System.out.println("Number of even integers: " + result[0]);
        System.out.println("Number of odd integers: " + result[1]);
    }

    public static int[] countEvenOdd(int[] arr) {
        int[] result = {0, 0}; // Index 0: Count of even numbers, Index 1: Count of odd numbers

        for (int num : arr) {
            if (num % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }

        return result;
    }
}
