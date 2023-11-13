package oct24;

import java.util.Scanner;

public class ques85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Input number of terms: ");
        int n = scanner.nextInt();

        // Display the cube of each number up to the given integer
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of the " + i + " is: " + cube);
        }

        scanner.close();
    }
}
