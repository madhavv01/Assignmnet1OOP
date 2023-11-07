package oct24;
import java.util.Arrays;

public class Q51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {12,33,44,56,28,11,16};
        System.out.println("previous Array :" + Arrays.toString(arr));  
        int []copy_arr= new int[7];
        
        for(int i=0; i<arr.length; i++) {
        	copy_arr[i] = arr[i];
        }
        System.out.println("copy Array:     " + Arrays.toString(copy_arr));
	}

}
