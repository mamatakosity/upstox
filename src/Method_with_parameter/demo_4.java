package Method_with_parameter;

public class demo_4 {//class body open
	public static void main(String[]args) {//main body open
		
		System.out.println("Main method started");
		
		XYZ(10,20,30,40);
		
		W_1('M','P');
		
		
		System.out.println("Main method ended");
		
		
	}//main method closed
	 
	public static void XYZ (int a,int b,int c,int d) {//regular method start//formal argument
		
	System.out.println("Additon of a & b is = "+(a+b));
	System.out.println("substraction of a & b is = "+(a-b));
	
		
	}//regular method closed
	public static void W_1(char g,char h) {//reg method start
		System.out.println("character store in k is "+g+h);
		
	}//reg method end
	

}//class body closed
