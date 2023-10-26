package oct24;
import java.util.Scanner;
public class ques28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        switch (inputChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(inputChar + " is a vowel.");
                break;
            default:
                System.out.println(inputChar + " is a consonant.");
        }

        scanner.close();

	}

}
