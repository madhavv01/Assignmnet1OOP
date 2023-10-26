package oct24;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double num1 = kb.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = kb.nextDouble();

        double max = Math.max(num1, num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);

        
        kb.close();

	}

}
