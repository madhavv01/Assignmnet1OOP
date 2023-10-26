package oct24;
import java.util.Scanner;
public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = kb.nextDouble();
        
        if(number < 0)
        	System.out.print("Invalid number. ");

        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is: " + squareRoot);

        kb.close();


	}

}
