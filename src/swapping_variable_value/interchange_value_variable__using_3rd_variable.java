package swapping_variable_value;

public class interchange_value_variable__using_3rd_variable {
	
	public static void main(String[]args) {
		
		int a=10;
		int b=20;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c= a;     //c=10
		    
		    a=b;        //a=20
		    
		    b=c;          //b=10
		    
		    System.out.println("after swapping: a ="+a+" and b ="+b);  // concatination +
		    
	}

}
