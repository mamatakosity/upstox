package zReinitialize;

public class global_without_initialization {
	static byte bt;
	static short sh;
	static int i;
	static long l;
	static double d;
	static float f;
	static char ch;
	static boolean b;
	static String s;
		
public static void main(String[] args) {
	System.out.println(bt);// 0//only declaring global variable we can print it
	System.out.println(sh);// 0
	System.out.println(i);// 0
	System.out.println(l);// 0
	System.out.println(d);// 0.0
	System.out.println(f);// 0.0
	System.out.println(ch);// empty box
	System.out.println(b);// false
	System.out.println(s);// null

}
}