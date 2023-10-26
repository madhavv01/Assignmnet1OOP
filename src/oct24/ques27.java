package oct24;
import java.util.Scanner;
public class ques27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        int daysInMonth = 0;

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2:  // February
                daysInMonth = 28;
                break;
            default:
                System.out.println("Invalid month.");
                scanner.close();
                return;
        }

        System.out.println("There are " + daysInMonth + " days in the selected month.");

        scanner.close();


	}

}
