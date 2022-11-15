package Exception_Handling;

public class Exception_error_handling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch(ArithmeticException monky) {
			System.out.println("Idiot enter valid denominator");
			System.out.println("exception is handled");
		}
		
		
	}

}
