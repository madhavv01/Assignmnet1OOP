package oct24;
import java.util.Scanner;
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = kb.nextDouble();

        double absoluteValue = (number < 0) ? -number : number;

        System.out.println("The absolute value of " + number + " is: " + absoluteValue);

        kb.close();

	}

}
