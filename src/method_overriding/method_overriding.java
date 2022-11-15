package method_overriding;

public class method_overriding {
	
	public static void main(String[]args) {
		
		System.out.println("program for overrding");
		
		System.out.println("cat talk");
		
		cat c=new cat();
		
		c.talk();
		
		System.out.println("dog talk");
		
		dog d =new dog();
		
		d.talk();
		
	}

}
