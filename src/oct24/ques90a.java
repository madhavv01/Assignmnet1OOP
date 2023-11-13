package oct24;

import java.util.Scanner;

public class ques90a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of lines
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        // Display the pattern
        for (int i = 1; i <= n; i++) {
            // Print numbers in reverse order from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
