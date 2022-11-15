package Replace_Special_Symbol_character;

import java.util.Scanner;

public class replace_multiple_symbol {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		String corrname=name.replaceAll("[^a-z A-Z]","");
		System.out.println(corrname);
		
	}

}
