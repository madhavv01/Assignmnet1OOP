package oct24;
import java.util.Scanner;
public class ques41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();

	}

}
