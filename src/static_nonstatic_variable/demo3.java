package static_nonstatic_variable;

public class demo3 {//class body open
	
	char ch='M'; //non static global variable
	String MBB="Mamata";
	long l=234567890987654l;
	boolean b= false;
	String s="velocity";

	public static void main(String[]args) {//main body open
		
		demo3 a=new demo3();// create object
		System.out.println(a.ch);
		
		demo3 O =new demo3();// create object
		System.out.println(O.MBB);
		
		demo3 G=new demo3();// create object
		System.out.println(G.l);
		
		demo3 K=new demo3();// create object
		System.out.println(K.b);
		
		demo3 L=new demo3();// create object
		System.out.println(L.s);
	}
	

}
