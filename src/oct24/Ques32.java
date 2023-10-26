package oct24;
import java.util.Scanner;
public class Ques32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        int first = 0, second = 1, next, i = 2;

        if (n >= 1) {
            System.out.print("Fibonacci Series: " + first);
        }
        if (n >= 2) {
            System.out.print(", " + second);
        }

        while (i < n) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
            i++;
        }

        System.out.println();
        scanner.close();

	}

}
