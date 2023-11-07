package method31oct;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the num1 : ");
		double num1 = kb.nextDouble();
		
		System.out.print("Enter the num2 : ");
		double num2 = kb.nextDouble();
		
		System.out.print("Enter the operation : ");
        
        char op = kb.next().charAt(0);
        
        if(op == '+') {
        	System.out.print(add(num1,num2));
        }
        else if(op == '-') {
        	System.out.print(sub(num1,num2));
        }
        else if(op == '*') {
        	System.out.print(multiplication(num1,num2));
        }
        else if(op == '/') {
        	System.out.print(division(num1,num2));
        }
        kb.close();
	}
	
        
	
	public static double add(double x, double y) {
	return x + y;}
	
	public static double multiplication(double x, double y) {
	return x * y;}
	
	public static double division(double x, double y) {
	return x / y;}
	
	public static double sub(double x, double y) {
	return x - y;
	}
	

}