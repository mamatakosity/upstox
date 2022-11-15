package Scanner;

import java.util.Scanner;

public class Take_input_from_user {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter 1 st no.");
		
		int num1=s.nextInt();
		
		System.out.println("enter 2 nd  no.");
		
		int num2=s.nextInt();
		
	System.out.println("Addition = "+(num1+num2));
	}

}
