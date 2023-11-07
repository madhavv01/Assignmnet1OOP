package oct24;
import java.util.Scanner;

public class Q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int value = kk.nextInt();
        
        int[]arr= new int[value];
        

        for(int i = 0; i<value; i++) {
        	System.out.print("Enter a number "+i+ " : ");
            arr[i] = kk.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i = 0; i<value; i++) {
            if(arr[i]>max){
                max = arr[i];

            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);

     kk.close();   
	}

}
