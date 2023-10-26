package oct24;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = kb.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        kb.close();

	}

}
