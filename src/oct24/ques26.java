package oct24;
import java.util.Scanner;
public class ques26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: $");
        double purchaseAmount = kb.nextDouble();

        double discount = calculateDiscount(purchaseAmount);

        System.out.println("You qualify for a discount of $" + discount);
        double discountedAmount = purchaseAmount - discount;
        System.out.println("Your discounted total is: $" + discountedAmount);

        kb.close();
    }

    public static double calculateDiscount(double purchaseAmount) {
        double discount = 0.0;

        if (purchaseAmount >= 100) {
            discount = purchaseAmount * 0.1; // 10% discount for purchases over $100
        } else if (purchaseAmount >= 50) {
            discount = purchaseAmount * 0.05; // 5% discount for purchases over $50
        }

        return discount;
    }


}
