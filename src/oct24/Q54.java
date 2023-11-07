package oct24;
import java.util.*;

public class Q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,28,11,16};
        System.out.println("previous Array :" + Arrays.toString(arr));
 	   System.out.print("Reversed array : ");  
 	   

       for(int i=arr.length-1;i>=0;i--) {
    	   System.out.print(arr[i]+ " ");   
       }

	}

}
