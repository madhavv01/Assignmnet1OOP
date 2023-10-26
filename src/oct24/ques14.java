package oct24;
import java.util.Scanner;
public class ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eq = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = eq.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = eq.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");

	}
        eq.close();
}	
}
