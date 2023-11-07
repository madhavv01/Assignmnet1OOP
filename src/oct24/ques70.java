package oct24;
public class ques70 {

    public static void main(String[] args) {
        int[] arr1 = {10, 10, 10, 10};
        int[] arr2 = {10, 10, 10, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {10, 20, 30, 40};

        System.out.println("Condition satisfied for arr1: " + checkSumOfTens(arr1));
        System.out.println("Condition satisfied for arr2: " + checkSumOfTens(arr2));
        System.out.println("Condition satisfied for arr3: " + checkSumOfTens(arr3));
        System.out.println("Condition satisfied for arr4: " + checkSumOfTens(arr4));
    }

    public static boolean checkSumOfTens(int[] arr) {
        int sumOfTens = 0;

        for (int num : arr) {
            if (num == 10) {
                sumOfTens += num;
            }
        }

        return sumOfTens == 30;
    }
}

