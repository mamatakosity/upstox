package Methods_Nonstatic_Regular;

public class NSRM_call_from_smae_class_3 {
	
	public static void main(String[]args) {
		
		System.out.println("Main method started");
		
		NSRM_call_from_smae_class_3 B=new NSRM_call_from_smae_class_3();
		
		B.m1();
		
		System.out.println("main method end");
		
	}//main method ends
	
	public void m1() {
		
		int a=90;
		int b=100;
		
		System.out.println("a= "+a);
		
		System.out.println("b ="+b);
		
		System.out.println("Multiplication  a*b= " +(a*b) );
	}

}
