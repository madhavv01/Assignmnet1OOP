package oct24;
public class Q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1= {254,458,44,125,458,166,225,365,47};
		int []arr2=  {125,547,448,166,228,369,148,985,365};
		for(int i=0;i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
			    if(arr1[i]==(arr2[j])){
				     System.out.println("Common elements are : " + arr1[i]);
				     break;
				}
			}
		}
	}

}
