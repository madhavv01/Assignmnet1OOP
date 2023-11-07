package oct24;
public class ques64 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int missingNumber = findMissingNumber(arr);
        
        if (missingNumber != -1) {
            System.out.println("The missing number is: " + missingNumber);
        } else {
            System.out.println("No missing number found.");
        }
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = totalSum - actualSum;

        if (missingNumber >= 1 && missingNumber <= n) {
            return missingNumber;
        } else {
            return -1; // Indicates that no missing number was found
        }
    }
}
