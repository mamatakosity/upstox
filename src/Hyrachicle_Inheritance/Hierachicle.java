package Hyrachicle_Inheritance;

public class Hierachicle {//ULC
	
	public static void main(String[]args) {
		
		System.out.println("total properties of son1");
		
		son1 s1=new son1();
		
		s1.mobile();
		s1.home();
		s1.money();
		
		
		System.out.println("total properties of son2");

		son2 s2=new son2();
		
		s2.bike();
		s2.home();
		s2.money();
		
		
		System.out.println("total properties of son3");
		
		son3 s3=new son3();
		
		s3.laptop();
		s3.home();
		s3.money();
		
	}

}
