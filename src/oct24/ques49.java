package oct24;

public class ques49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 10, 15, 20, 25 };

        int targetValue = 15;

        int index = -1; 

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("The index of " + targetValue + " is: " + index);
        } else {
            System.out.println(targetValue + " was not found in the array.");


	}
	}
}
