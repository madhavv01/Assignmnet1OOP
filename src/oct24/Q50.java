package oct24;
import java.util.Arrays;

public class Q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,28,11,16};
        System.out.println("Original Array : " + Arrays.toString(arr));     

		int remove=5;   // give position of element you want to remove//
		for(int i= remove; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("After removing "+ Arrays.toString(arr));
	}

}
