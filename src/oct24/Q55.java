package oct24;
import java.util.*;

public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,28,11,33,16,44};
        System.out.println("previous Array :" + Arrays.toString(arr));
        
        for(int i=0; i<arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
            	if ((arr[i] == arr[j]) && (i != j)) {
        		 System.out.println("repeated is " + arr[j]);
        	}
            	}
            }
	}

}
