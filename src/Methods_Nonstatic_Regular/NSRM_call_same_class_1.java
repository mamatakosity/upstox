package Methods_Nonstatic_Regular;

//Non-static regular method call fron same class

public class NSRM_call_same_class_1 {//class body open//*user logic code*//
	
	public static void main(String[]args) {//main body open
		
		System.out.println("Main method is started");
		
		NSRM_call_same_class_1 M =new NSRM_call_same_class_1();//create object M is ref.variable
		
		M.sample_1();
		
		M.sample_2();
		
		System.out.println("Main method is ended");
		
	}//main method ended
	
	public void sample_1() {//declaration //this is non static method so static word no here
		
		System.out.println("I am form method sample_1");//implementation
		
	}
	
	public void sample_2() {//declaration
		
		System.out.println("I am form method sample_2");//implementation
		
	}

}//class body closed
