package oct24;
import java.util.Scanner;
public class ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sq = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sq.nextInt();

	        if (isPerfectSquare(number)) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is not a perfect square.");
	            sq.close();
	        }
	    }

	   
	    public static boolean isPerfectSquare(int number) {
	        int sqrt = (int) Math.sqrt(number);
	        return sqrt * sqrt == number;
	        
	}

}
