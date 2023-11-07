package oct24;
public class ques69 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, -1, 2, 3, 4};
        int[] arr3 = {0, 0, 0, 0, 0};
        int[] arr4 = {2, 3, 4, 5, 6};

        System.out.println("arr1 contains only values other than 0 and -1: " + checkArray(arr1));
        System.out.println("arr2 contains only values other than 0 and -1: " + checkArray(arr2));
        System.out.println("arr3 contains only values other than 0 and -1: " + checkArray(arr3));
        System.out.println("arr4 contains only values other than 0 and -1: " + checkArray(arr4));
    }

    public static boolean checkArray(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }
}
