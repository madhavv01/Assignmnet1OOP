package oct24;

public class ques50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 10, 15, 20, 25 };

        int targetValue = 15;

        int[] newArray = new int[numbers.length - 1];
        int newIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != targetValue) {
                newArray[newIndex] = numbers[i];
                newIndex++;
            }
        }

        System.out.println("Original array: " + Array.toString(numbers));
        System.out.println("Value " + targetValue + " removed from the array.");
        System.out.println("New array: " + Arrays.toString(newArray));
        
	}

}
/////