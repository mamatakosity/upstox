package swapping_variable_value;

public class demo1 {
	public static void main(String[]args) {
		
		int a=100;
		int b=50;
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		int c= a;   //c=100
		
		    a= b;   //a=50
		    
		    b= c;    //b=100
		    
		    System.out.println("After swapping value of a  and b are");
		    
		    System.out.println("a ="+a);
		    System.out.println("b ="+b);
		
	}

}
