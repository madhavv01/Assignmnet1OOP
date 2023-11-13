package oct24;

import java.util.Scanner;

public class ques86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Input the number of terms: ");
        int n = scanner.nextInt();

        // Calculate the sum of the series
        int sum = 0;
        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term);
            sum += term;
            if (i < n) {
                System.out.print(" + ");
            }
            term = term * 10 + 1;
        }

        System.out.println("\nThe Sum is: " + sum);

        scanner.close();
    }
}
