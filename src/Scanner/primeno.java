package Scanner;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("no is prime");
		}
		else {
			System.out.println("no not prime");
		}
	}

}
