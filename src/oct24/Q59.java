package oct24;
import java.util.Arrays;

public class Q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= new int[]{12,33,44,44,56,16,16,18,18,28};
        System.out.println("previous Array :" + Arrays.toString(arr));
		int current = arr[0];
		boolean found = false;
		
		for(int i=0; i<arr.length; i++) {
			if (current == arr[i] && !found) {
		        found = true;
		    } else if (current != arr[i]) {
		        System.out.print(" " + current);
		        current = arr[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
	}

}
