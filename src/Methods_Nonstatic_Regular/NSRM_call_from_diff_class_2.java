package Methods_Nonstatic_Regular;

public class NSRM_call_from_diff_class_2 {

	
	public static void main(String[]args) {//main method started
		
		System.out.println(" Program Name-Non static regular method calls from diff class");
		
		System.out.println("MAin method is started");
		
		diff_class_A x=new diff_class_A();
		
		x.m1();//calling
		
		x.m2();
		
		
		System.out.println("MAin method ended");
		
	
		
		
	}
}
