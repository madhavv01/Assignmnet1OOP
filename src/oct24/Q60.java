package oct24;
import java.util.Arrays;

public class Q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int []arr= {12,33,44,56,28,99,11,33,16,88};
        System.out.println("previous Array :" + Arrays.toString(arr));
        int temp, second;
        second = arr.length;

        for(int i = 0; i<second; i++ ){
           for(int j = i+1; j<second; j++){

              if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
              }
           }
        }
        System.out.println("Third second largest number is:: "+arr[second-2]);
	}

}
