package Conditional_statement_If_else_ladder;

public class if_else_ladder_pr10 {
	public static void main(String[] args) {
	
	int girl=10;
	
	int boy=20;
	
	if(girl>=18 && boy>=21) {
		
		System.out.println("Girls and boy are eligible for marriage");
	}
	
	else if(girl>=18 && boy<21) {
		
		System.out.println("Girls is eligible but boy is not eligible");
	}
	
	else if (girl<18 && boy>=21) {
		
		System.out.println("Girl is not eligible but boy is eligible");
	}
	
	else {
		
		System.out.println("Both are not eligibloe for marriage");
	}

		
		
	}
	

}
