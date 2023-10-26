package oct24;
import java.util.Scanner;
public class ques25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = kb.nextInt();

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = months[monthNumber - 1];
            System.out.println("The month is: " + monthName);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            kb.close();
        }

	}

}
