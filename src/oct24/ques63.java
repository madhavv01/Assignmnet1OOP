package oct24;
public class ques63 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};

        boolean areEqual1And2 = areArraysEqual(arr1, arr2);
        boolean areEqual1And3 = areArraysEqual(arr1, arr3);

        System.out.println("Are arr1 and arr2 equal? " + areEqual1And2);
        System.out.println("Are arr1 and arr3 equal? " + areEqual1And3);
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
