package oct24;
import java.util.Scanner;
public class ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = kb.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = kb.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = kb.nextDouble();

        double largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

		kb.close();

	}
}
