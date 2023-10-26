package oct24;
import java.util.Scanner;
public class ques26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: $");
        double purchaseAmount = scanner.nextDouble();

        double discount = calculateDiscount(purchaseAmount);

        System.out.println("You qualify for a discount of $" + discount);
        double discountedAmount = purchaseAmount - discount;
        System.out.println("Your discounted total is: $" + discountedAmount);

        scanner.close();
    }

    public static double calculateDiscount(double purchaseAmount) {
        double discount = 0.0;

        if (purchaseAmount >= 100) {
            discount = 10; // 10% discount for purchases over $100
        } else if (purchaseAmount >= 50) {
            discount = 5; // 5% discount for purchases over $50
        }

        return (discount / 100) * purchaseAmount;
    }


}
