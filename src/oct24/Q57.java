package oct24;
public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]s1= {"math","java","html","ccs","abc","abs"};
		String []s2= {"pdf","jpg","png","html","ccs","crm"};
		
		for(int i = 0; i < s1.length; i++){
			   for(int j = 0; j < s2.length; j++){// inner loop
			    if(s1[i].equals(s2[j])){
			     System.out.println("Common elements are : " + s1[i]);
			     break;
			    }
			   }
			  }
	}

}
