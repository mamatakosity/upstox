package Reverse_string;

public class reverse_string_PRANAV {
	
	public static void main(String[]args) {
		
		String s="PRANAV";
		
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			s1=s1+s.charAt(i);
			
		}
		
		System.out.println(s1);
	}
	

}
