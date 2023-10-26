package oct24;

public class ques47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = { 5.6, 3.2, 8.7, 4.1, 2.9 };

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        System.out.println("Average: " + average);
        
	}

}
