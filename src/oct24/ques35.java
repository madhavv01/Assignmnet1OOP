package oct24;
import java.util.Scanner;
public class ques35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = kb.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = kb.nextInt();

        double result = 1.0;
        int i = 0;

        while (i < exponent) {
            result *= base;
            i++;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        kb.close();
    }


}
