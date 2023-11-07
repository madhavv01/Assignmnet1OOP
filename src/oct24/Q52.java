package oct24;
import java.util.Arrays;

public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,28,11,16,45,90};
        System.out.println("previous Array :" + Arrays.toString(arr));  
        int N_index= 5;
        
        int N_value= 66;
        
        for(int i= arr.length-1; i>N_index; i--) {
        	arr[i]=arr[i-1];
        }
        arr[N_index]=N_value;
        System.out.println("New Array: " + Arrays.toString(arr));
	}

}
