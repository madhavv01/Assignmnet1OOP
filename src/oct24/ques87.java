package oct24;

import java.util.Scanner;

public class ques87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
