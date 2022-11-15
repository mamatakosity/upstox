package methods_static_regular;

public class SRM_call_from_sameclass_pr2 {//class body open
	public static void main(String[]args) {//main method started
		
		System.out.println("Main method body is started");
		
		W();//regular method W called in main method
		X();//we can called no. of regular method in main method//
		Y();
		Z();
		
		System.out.println("Main method body is ended");
	}//main method body closed


public static void W() {      //regular method //W started
System.out.println("What is your name?");
}//regular method W closed

public static void X() {
	System.out.println("My name is Mamata");
}

public static void Y() {
	System.out.println("How are you?");
}

public static void Z() {
	System.out.println("Fine!!!");
	
 }
}//class body closed
