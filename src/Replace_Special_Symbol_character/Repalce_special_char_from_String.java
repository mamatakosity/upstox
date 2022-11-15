package Replace_Special_Symbol_character;

import java.util.Scanner;

public class Repalce_special_char_from_String {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter String which contain special symbol");
		
		String name=s.next();
		
		String corrname=name.replace("@", "s");
		
		System.out.println(corrname);
	}

}
