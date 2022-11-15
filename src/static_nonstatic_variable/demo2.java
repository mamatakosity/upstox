package static_nonstatic_variable;

public class demo2 {//class body open
	
	int a=23;
	
	public static void main(String[]args) {//main body open
		
		demo2 g=new demo2();//created new object for //printing non static global variable
		
		System.out.println(g.a);
		
	}
	

}
