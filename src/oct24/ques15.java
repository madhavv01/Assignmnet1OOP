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

        
        if (num1>=num2 && num1>=num3 && num1>=num4) {
        	System.out.println("Num 1 is the largest ");
        }

        else if (num2>=num1 && num2>=num3 && num2>=num4) {
        	System.out.println("Num 2 is the largest ");
        }

        else if (num3>=num1 && num3>=num2 && num3>=num4) {
        	System.out.println("Num 1 is the largest ");
        }else

        System.out.println("Num 4 is the largest ");
        input.close();
	}

}
