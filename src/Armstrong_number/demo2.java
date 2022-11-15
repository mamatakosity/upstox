package Armstrong_number;

import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=s.nextInt();
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;
			armnum=r*r*r+armnum;
			num=num/10;
		}
		if(actnum==armnum) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
		}
		
	}

}
