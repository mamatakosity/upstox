package Conditional_statement_If_else_ladder;

public class if_else_ladder_pr3 {
	public static void main(String[] args) {
		System.out.println("Program for how many digit in no.");
		
		int Number=1234;
		
		System.out.println("Number is = "+Number);
		
		if(Number <100 && Number>=1) {
			System.out.println("Its Two digit no.");
		}
		
		else if(Number <1000 && Number>=100) {
			System.out.println("Its three digit no.");
		}
		
		else if(Number <10000 && Number>=1000) {
			System.out.println("Its Fout digit no.");
		}
		
		
		else {
			System.out.println("no is not between condition");
		}
	}

}
