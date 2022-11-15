package Interface;

public class Interface_sample implements Interface1,Interface2,Interface3 {
	
	public void add() {
		
		int a=10;
		int b=12;
		System.out.println("addition= "+(a+b));
		
		
	}
	
	public void sub() {
		
		int x=12;
		int y=10;
		System.out.println("Substraction= "+(x-y));
		
	}
	
	public void multi() {
		
		int s=2;
		int d=3;
		System.out.println("multiplication= "+(s*d));
		
	}

}
