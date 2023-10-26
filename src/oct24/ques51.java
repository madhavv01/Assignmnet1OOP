package oct24;

public class ques51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originalArray = { 5, 10, 15, 20, 25 };

        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        for (int value : copiedArray) {
            System.out.print(value + " ");

        }
	}

}
