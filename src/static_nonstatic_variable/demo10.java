package static_nonstatic_variable;

public class demo10 {
	
	static char d='h';
	
	char h='d';
	
	public static void main(String[] args) {
		
		System.out.println(d);
		
		demo10 j=new demo10();
		
		System.out.println(j.h);
	}
	
	

}
