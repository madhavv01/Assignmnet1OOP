package oct24;
import java.util.Scanner;
public class ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
        int counter = 0;
        for(int i = 1; i <= number; i++)
        	if(number %i == 0) {
        		counter++;
        	}
        if(counter == 2) {
        	System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }
        input.close();
	}

}
