package Reverse_string;

public class reverse_string_check_palindrome1 {
	
	public static void main(String[]args) {
		
		String s="MAMATA";
		
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		
		if(s.equals(s1)) {
			System.out.println("Given String palindrome");
		}
		else {
			System.out.println("Given String not palindrome");
		}
	}

}
