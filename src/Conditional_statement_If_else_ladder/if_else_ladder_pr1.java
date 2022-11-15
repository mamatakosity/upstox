package Conditional_statement_If_else_ladder;

public class if_else_ladder_pr1 {
	public static void main(String[] args) {
		
		System.out.println("Program for student progress");
		
		int marks=60 ;
		
		System.out.println("Marks is= "+marks);
		
		if(marks>=75) {
			System.out.println("pass with Distinction");
		}
		
		else if(marks>=60) {
			System.out.println("passed with 1st class");
		}
		
		else if(marks>=50) {
			System.out.println("passed with 2nd class");
		}
		
		else if(marks>=40) {
			System.out.println("passed with 3rd class");
		}
		
		else if(marks>=35) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
	}

}
