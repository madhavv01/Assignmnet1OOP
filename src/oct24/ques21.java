package oct24;
import java.util.Scanner;
public class ques21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = kb.nextInt();

	        if (number % 3 == 0 && number % 5 == 0) {
	            System.out.println("The number is a multiple of both 3 and 5.");
	        } else {
	            System.out.println("The number is not a multiple of both 3 and 5.");
	            kb.close();
	}

}
}
