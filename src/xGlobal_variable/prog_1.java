package xGlobal_variable;

public class prog_1 {//class  body open
	static int i=10;//global variable are always outside the main body
	static byte bt=12;
	static float f=45;
	static float h=35;
	//static float h=456; can't reinitialize
	static char gh='r';
	static boolean hk;//this is only declaring
	public static void main(String[]args) {//main body open
		System.out.println(i);
		System.out.println(bt);
		System.out.println(f);
		System.out.println(h);
		System.out.println(gh);
		System.out.println(hk);//by default false printing bcoz hk is not initialize
	
	}

}
