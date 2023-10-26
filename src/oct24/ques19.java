package oct24;
import java.util.Scanner;
public class ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is both even and positive.");
        } else {
            System.out.println("The number is not both even and positive.");
            kb.close();
	}
	}
}
