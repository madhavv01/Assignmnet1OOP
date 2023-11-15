package oct24;

public class ques78 {
    public static void main(String[] args) {
        int[] array = {5, 6, 1, 2, 3, 4};

        int rotationCount = findRotationCount(array);
        System.out.println("Rotation count: " + rotationCount);
    }
    private static int findRotationCount(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            if (array[low] <= array[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % array.length;
            int prev = (mid + array.length - 1) % array.length;

            if (array[mid] <= array[next] && array[mid] <= array[prev]) {
                return mid;
            }

            if (array[mid] <= array[high]) {
                high = mid - 1;
            } else if (array[mid] >= array[low]) {
                low = mid + 1;
            }
        }

        return -1; 
    }
}
