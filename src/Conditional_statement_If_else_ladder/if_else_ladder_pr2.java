package Conditional_statement_If_else_ladder;

public class if_else_ladder_pr2 {
	public static void main(String[] args) {
		
		System.out.println("Program for OR Gate");
		int a=0;
		int b=0;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		if(a==0 && b==0) {
			
			System.out.println("Output is 0");
		}
		
		else if(a==0 && b==1) {
			
			System.out.println("Output is 1");
		}
	else if(a==1 && b==0) {
		
		System.out.println("Output is 1");
	}
	else if(a==1 && b==1) {
		
		System.out.println("Output is 1");
		
	}
	else {
		System.out.println("No output");
	}
	}
	

}

