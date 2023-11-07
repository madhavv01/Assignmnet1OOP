package oct24;
public class ques61 {

    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 6, 17, 3};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("The second smallest element is: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}
