package static_nonstatic_variable;

public class demo1 {//class body open
	static int i=15;
	static float f=45f;
	static String s="Mamata";
	int a=20;
	float h=78f;
	String name="Mamata B";
	
	public static void main(String[]args) {//main body open
		
		System.out.println(i);//static variable directly print
		System.out.println(f);
		System.out.println(s);
		//System.out.println(a);//non static variable can't print directly,
		//we have to create object so -class name ref.variable =new class name()
		demo1 Aa=new demo1();
		System.out.println(Aa.a);
		
		demo1 G=new demo1();//demo1  = class name ,G =ref variable,new is standard ,demo1=classname,()
		System.out.println(G.h);//for printing (ref variable.actual variable)
		
		demo1 M=new demo1();
		System.out.println(M.name);
		
		
		
		
		
	}
	
	

}
