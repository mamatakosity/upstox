package SIB_static_initializer_block;

public class prog_1 {
	
	public static void main(String[] args) {//main method body open
		System.out.println("Hi good mng");
		System.out.println("main method started");
		System.out.println("first");
		System.out.println("second");
		System.out.println("Third");
		
	}//main method body closed


		static {//SIB body open
			
			System.out.println("I will execute before the execution of main method");
		}//SIB body close
		

}
