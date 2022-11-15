package Method_with_parameter;

public class demo_1 {
	public static void main(String[]args) {
		
		addition(10,20);//compile time binding(CTB)
			
	}
	
	public static void addition(int a,int b) {//formal arguments
		int c=a+b;
		System.out.println(c);
		
		
	}

}
