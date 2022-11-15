package Methods_Nonstatic_Regular;

public class NSRM_call_from_same_class_2 {
	
	public static void main(String[]args) {//main method start
	
	System.out.println("PROGRAM NAME-NSRM call from SAME class\n");// (\n) for print next line
	
	System.out.println("MAin method started\n");
	
	System.out.println("Addition of Two no.in same class but method addition\n");
	
	NSRM_call_from_same_class_2 m=new NSRM_call_from_same_class_2();//object creation
	
	m.addition();
	
	System.out.println("Subtraction of Two nos in same class but method subtraction\n");
	
	m.subtraction();
	
	
	System.out.println("Main method ended\n");
	
	}//main method end
	
	public void addition() {
		
		int a=12;
		
		int b=12;
		
		System.out.println("Addition of a & b is = "+(a+b));
	}
		
		public void subtraction() {
			
			int x=50;
			
			int y=50;
			
			
			System.out.println("Subtractio x & y is = "+(x-y));
		}
			
		
		
	
	
}
