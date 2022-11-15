package methods_static_regular;

public class SRM_call_from_sameclass_pr3 {
	public static void main(String[]args) {//main methid is open
		System.out.println("main method is started\n");
		reg_method_1();
		reg_method_2();
		
		System.out.println("Main method is ended\n");
	}//main method is closed
	
	public static void reg_method_1() {
		System.out.println("subprogram (reg_method_1) is started");
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public static void reg_method_2() {
		System.out.println("subprogram (reg_method_2) is started");
		float f=45f;
		char ch='M';
		System.out.println(f);
	    System.out.println(ch);
	}

}
