package SIB_static_initializer_block;

public class prog_5 {
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
	int x=4;
	int y=6;
	int z=x*y;
	System.out.println(z);
	}//main method end
	
	static {
		
		System.out.println("Static initializer block");
		
		int a=12;
		int b=3;
		int c=a+b;
		System.out.println(c);
		
	}

}
