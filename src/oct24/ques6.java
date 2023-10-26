package oct24;
import java.util.Scanner;
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
   
        System.out.print("Enter the first number: ");
        double firstNumber = kb.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = kb.nextDouble();

        double temp;

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping, the first number is: " + firstNumber);
        System.out.println("After swapping, the second number is: " + secondNumber);

        kb.close();

	}

}
