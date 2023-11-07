package oct24;
import java.util.Scanner;
public class ques22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b : ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c : ");
        double c = input.nextDouble();
        
        myquadricmethod(a, b, c);
        input.close();
	}
	
	public static void myquadricmethod(double a, double b, double c) {
	double delta = (b * b) - 4 * a * c;
	
	if (delta > 0) {
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("The roots are real and distinct:");
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    } else if (delta == 0) {
        double root = -b / (2 * a);
        System.out.println("The root is real and equal:");
        System.out.println("Root: " + root);
    } else {
        System.out.println("The roots are imaginary.");
    
    }

        }
	
}
