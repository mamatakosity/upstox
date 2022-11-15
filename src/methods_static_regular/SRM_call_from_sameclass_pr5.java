package methods_static_regular;

public class SRM_call_from_sameclass_pr5 {//class body open
	
	public static void main(String[]args) {//main method body open
		
		System.out.println("Main method started");
		
		System.out.println("Regular method started");
		
		add();//call from regular method
		
		System.out.println("Regular method ends");
		
		
		System.out.println("Main method ended");
		
		
	}//main method body closed
	
	public static void add() {//regular method started
		
		int a=78;
		int b=12;
		System.out.println("a = "+a);
		
		System.out.println("b= "+b);
		
		System.out.println("The addition of a and b is = "+(a+b));
		
		
	}
	

}
