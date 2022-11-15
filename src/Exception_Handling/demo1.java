package Exception_Handling;

public class demo1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
		}
		catch(ArithmeticException monky) {
			System.out.println("enter valid no");
		System.out.println("exception is handled");	
		}
	}

}
