package oct24;
import java.util.Scanner;
public class ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        System.out.print("Enter the fourth number: ");
        double num4 = input.nextDouble();

        double largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        if (num4 > largest) {
            largest = num4;
        }

        System.out.println("The largest number is: " + largest);
        input.close();
	}

}
