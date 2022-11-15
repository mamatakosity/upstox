package Scanner;

import java.util.Scanner;

public class find_even_odd_using_scann {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("please enter the no");
		
		int n1=s.nextInt();
		
		if(n1%2==0) {
			System.out.println("given no is even");
		}
		else {
			System.out.println("given no is odd");
		}
	}

}
