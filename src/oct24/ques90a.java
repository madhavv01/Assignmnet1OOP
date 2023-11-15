package oct24;

import java.util.Scanner;

public class ques90a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(n - j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
