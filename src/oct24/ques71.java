package oct24;
public class ques71 {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 65, 40, 77, 50, 20};

        
        int element1 = 65;
        int element2 = 77;

        boolean containsElements = checkArrayElements(numbers, element1, element2);

        if (containsElements) {
            System.out.println("The array contains both specified elements (65 and 77).");
        } else {
            System.out.println("The array does not contain both specified elements (65 and 77).");
        }
    }

    private static boolean checkArrayElements(int[] array, int element1, int element2) {
        boolean foundElement1 = false;
        boolean foundElement2 = false;

        for (int num : array) {
            if (num == element1) {
                foundElement1 = true;
            } else if (num == element2) {
                foundElement2 = true;
            }

            if (foundElement1 && foundElement2) {
                break;
            }
        }

        return foundElement1 && foundElement2;
    }
}
