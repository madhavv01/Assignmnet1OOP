package oct24;

import java.util.Scanner;

public class ques90b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of lines
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        // Display the pattern
        for (int i = 1; i <= n; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
