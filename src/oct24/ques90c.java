package oct24;

import java.util.Scanner;

public class ques90c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of lines
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        // Display the pattern
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
