package oct24;
public class ques71 {
    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {10, 30, 65, 40, 77, 50, 20};

        // Specified elements to check
        int element1 = 65;
        int element2 = 77;

        // Check if the array contains the specified elements
        boolean containsElements = checkArrayElements(numbers, element1, element2);

        // Display the result
        if (containsElements) {
            System.out.println("The array contains both specified elements (65 and 77).");
        } else {
            System.out.println("The array does not contain both specified elements (65 and 77).");
        }
    }

    // Function to check if an array contains two specified elements
    private static boolean checkArrayElements(int[] array, int element1, int element2) {
        boolean foundElement1 = false;
        boolean foundElement2 = false;

        // Iterate through the array to check for specified elements
        for (int num : array) {
            if (num == element1) {
                foundElement1 = true;
            } else if (num == element2) {
                foundElement2 = true;
            }

            // Break the loop if both elements are found
            if (foundElement1 && foundElement2) {
                break;
            }
        }

        // Return true if both elements are found, otherwise return false
        return foundElement1 && foundElement2;
    }
}
