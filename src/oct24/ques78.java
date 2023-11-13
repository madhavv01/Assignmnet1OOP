package oct24;

public class ques78 {
    public static void main(String[] args) {
        // Sample rotated sorted array
        int[] array = {5, 6, 1, 2, 3, 4};

        // Find and display the rotation count
        int rotationCount = findRotationCount(array);
        System.out.println("Rotation count: " + rotationCount);
    }

    // Function to find the rotation count in a rotated sorted array
    private static int findRotationCount(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // If the array is already sorted, the rotation count is 0
            if (array[low] <= array[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % array.length;
            int prev = (mid + array.length - 1) % array.length;

            // Check if mid is the rotation point
            if (array[mid] <= array[next] && array[mid] <= array[prev]) {
                return mid;
            }

            // Update low or high based on which half is unsorted
            if (array[mid] <= array[high]) {
                high = mid - 1;
            } else if (array[mid] >= array[low]) {
                low = mid + 1;
            }
        }

        return -1; // Invalid input (shouldn't reach here for a rotated sorted array)
    }
}
