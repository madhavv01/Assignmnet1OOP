package oct24;
import java.util.Scanner;
public class ques34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        
        int i = 1;
        while (i <= 10) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            i++;
        }

        scanner.close();

	}

}
