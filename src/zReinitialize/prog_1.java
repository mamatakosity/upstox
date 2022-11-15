package zReinitialize;

public class prog_1 {
	static int r;
	public static void main(String[] args) { //reinitialization concept
	int i=10;
	i=20;
	i=30;
	i=40;
	i=50;
	i=60;//previous data deleted and updated data store i=60
	System.out.println(i);//i=60
	
	// without declaring variable try to print
	
	//int j;//only declaration
	//System.out.println(j);//we have to initilize it
	//without declaring and initializing local variable can't print
	
	//print global variable which is only declared
	System.out.println(r);//0 // global variable which is only declared//only declaring we can print it
	}
}
