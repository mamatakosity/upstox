package Logical_Programs;

public class pr5_find_factorial_5 {
	
	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println(fact);
	}

}
