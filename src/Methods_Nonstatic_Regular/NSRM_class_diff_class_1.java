package Methods_Nonstatic_Regular;

//Non-static regular method call from different class

public class NSRM_class_diff_class_1 {//user logic class
	
	
	public static void main(String[]args) {//main method started
		
		System.out.println("Mqain method is started");
		
		diff_class_A b= new diff_class_A();//object
		
		b.m1();
		
		b.m2();
		
		
		System.out.println("Main method body closed");
		
	}//main method is closed
	
}//class body is closed
