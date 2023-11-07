package oct24;
import java.util.Scanner;
public class ques30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int N = kb.nextInt();
        
            int sum = 0;
            int counter = 1;
            while (counter <= N) {
                sum += counter;
            }

            System.out.println("The sum of natural numbers from 1 to " + N + " is: " + sum);
        kb.close();
	}

}
