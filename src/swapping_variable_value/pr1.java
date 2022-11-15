package swapping_variable_value;

public class pr1 {
	
	public static void main(String[]args) {
		
		int a=2;
		int b=5;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a=a+b;     //2+5=7
		b=a-b;       //7-5=2
		a=a-b;       //7-2=5
		
		System.out.println("after swapping");
		
		System.out.println("a = "+a);
		
		System.out.println("b = "+b);
				  
		
	}

}
