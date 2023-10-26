package oct24;
import java.util.Scanner;
public class ques43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = 0;
        int count = 0;

        do {
            square += number;
            count++;
        } while (count < 2);

        System.out.println("The square of " + number + " is: " + square);

        scanner.close();

	}

}
