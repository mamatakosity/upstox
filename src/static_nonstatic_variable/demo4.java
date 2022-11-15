package static_nonstatic_variable;

public class demo4 {
	String G="My name is Mamata";
	char g='H';
	String s="GCOEJ";
	
	 public static void main(String[]args) {
		 
		 demo4 A= new demo4();
		 System.out.println(A.G);
		 demo4 H=new demo4 ();
		 System.out.println(H.g);
		 demo4 K=new demo4();
		 System.out.println(K.s);
	 }

}
