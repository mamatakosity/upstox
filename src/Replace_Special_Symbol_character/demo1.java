package Replace_Special_Symbol_character;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name contain special symbol");
		
		String name=s.next();
		
		String corrname=name.replace("@","a");
		System.out.println(corrname);
	}

}
