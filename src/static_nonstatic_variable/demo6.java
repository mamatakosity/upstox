package static_nonstatic_variable;

public class demo6 {
	String s="Good Morning";
	float f=234f;
	public static void main(String[]args) {
		demo6 S1=new demo6();//object 
		System.out.println(S1.s);
		
		demo6 F1=new demo6 ();//object
		System.out.println(F1.f);
		
	}
	
	

}
