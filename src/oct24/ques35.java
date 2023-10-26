package oct24;
import java.util.Scanner;
public class ques35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = 1.0;
        int i = 0;

        while (i < exponent) {
            result *= base;
            i++;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }


}
