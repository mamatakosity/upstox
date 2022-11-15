package Conditional_statement_If_else_ladder;

public class if_else_ladder_pr6 {
	
	public static void main(String[] args) {
	
		System.out.println("Program for if else ladder");
		
		int a= 10;
		
		int b= 5;
		
		System.out.println("a = "+a);
		
		System.out.println("b = "+b);
		
		
		if(a==0 && b==0) {
			
			System.out.println("Invalid entry please check value ");
		}
		
		else if(a>b) {
			
			float Div =a/b;
			
			System.out.println("division of a and b is = "+Div);
		}
		
		else if (a<b){
			
			float d= b/a;
			
			System.out.println("division of b and  a is = "+d);
		}
		
		else {
			
			System.out.println("no result found");
		}
		
		
	}

}
