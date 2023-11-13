package oct24;

import java.util.Scanner;

public class ques90h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of lines (should be an odd number)
        System.out.print("Enter the number of lines (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            // Display the star diamond pattern
            int half = n / 2 + 1;

            for (int i = 1; i <= half; i++) {
                // Print spaces
                for (int j = 1; j <= half - i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = half - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= half - i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}
