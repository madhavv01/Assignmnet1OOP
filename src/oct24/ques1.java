package oct24;
import java.util.Scanner;
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		 System.out.print("Enter a number: ");
	        int number = kb.nextInt();
	        if (number %2 == 0) {
	        	System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        
	        }
	        kb.close();

	}

}
