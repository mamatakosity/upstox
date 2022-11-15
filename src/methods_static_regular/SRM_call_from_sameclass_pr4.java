package methods_static_regular;

public class SRM_call_from_sameclass_pr4 {
	public static void main(String[]args) {//main method is open
		System.out.println("Main method body is open\n");
		
		program_1();
		System.out.println("Main method body is closed\n");
		
	}//main method closed
	
	public static void program_1() {
		int a=10;
		int b=12;
		int c=15;
		int d=20;
	    System.out.println("addition of a.b.c.d is= "+(a+b+c+d));
	}

}
