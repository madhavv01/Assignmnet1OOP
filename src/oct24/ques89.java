package oct24;

import java.util.Scanner;

public class ques89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for the multiplication table
        System.out.print("Input the number (Table to be calculated): ");
        int number = scanner.nextInt();

        // Display the multiplication table
        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }

        scanner.close();
    }
}
