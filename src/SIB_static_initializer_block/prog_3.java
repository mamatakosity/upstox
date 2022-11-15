package SIB_static_initializer_block;

public class prog_3 {
	
	public static void main(String[] args) {
		
		//main method start
		
		System.out.println("First Statement");
		System.out.println("Second Statement");
		System.out.println("Third Statement");
		
		
	}//main method end
	
	static {//in static block ,,it will execute before main method
		
		int a=10;
		int b=30;
		System.out.println("Addtion of a and b is = "+(a+b));
		
	}

}
