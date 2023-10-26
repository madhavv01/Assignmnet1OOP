package oct24;
import java.util.Scanner;
public class ques39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;

            do {
                factorial *= i;
                i++;
            } while (i <= n);

            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        scanner.close();


	}

}
