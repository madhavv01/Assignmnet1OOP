package oct24;

import java.util.Scanner;

public class ques87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Input n numbers from the keyboard
        System.out.println("Enter " + n + " numbers:");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        // Calculate and display the sum and average
        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
