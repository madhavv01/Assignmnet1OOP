package oct24;

import java.util.Scanner;

public class ques90g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of lines (should be an odd number)
        System.out.print("Enter the number of lines (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            // Display the odd number diamond pattern
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= Math.abs(n / 2 - i); j++) {
                    System.out.print(" ");
                }

                // Print numbers
                int num = i;
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print(num);
                    if (k < i) {
                        num--;
                    } else {
                        num++;
                    }
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}
