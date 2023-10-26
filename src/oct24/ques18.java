package oct24;
import java.util.Scanner;
public class ques18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = nb.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        nb.close();
	}

}
