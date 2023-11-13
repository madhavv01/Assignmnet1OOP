package oct24;

import java.util.Scanner;

public class ques90d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of lines
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        // Display the upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Display the lower part of the diamond (excluding the center line)
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
