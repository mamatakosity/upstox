package swapping_variable_value;

public class swapping_without_3rd_variable {
	
	public static void main(String[]args) {
		
		int a= 10;
		
		int b=20;
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		a=a+b;   //a=10+20=30
		
		b=a-b;   //30-20=10
		
		a=a-b;   //30-10=20
		
		System.out.println("after swapping the value of a & b are ");
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
