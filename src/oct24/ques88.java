package oct24;

import java.util.Scanner;

public class ques88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the grade: ");
        char grade = scanner.next().toUpperCase().charAt(0); // Convert to uppercase for case-insensitivity

        String description;

        switch (grade) {
            case 'E':
                description = "Excellent";
                break;
            case 'V':
                description = "Very Good";
                break;
            case 'G':
                description = "Good";
                break;
            case 'A':
                description = "Average";
                break;
            case 'F':
                description = "Fail";
                break;
            default:
                description = "Invalid Grade";
        }

        System.out.println("You have chosen: " + description);

        scanner.close();
    }
}
