package oct24;
import java.util.Scanner;
public class ques31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int N = kb.nextInt();
        int factorial = 1;
        int counter = 1;
        while (counter <= N)
        {
                factorial *= counter;
                counter++;
        }

        System.out.println("The factorial of " + N + " is: " + factorial);
        kb.close();    

	}

}
