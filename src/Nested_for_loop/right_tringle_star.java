package Nested_for_loop;

public class right_tringle_star {
	
	public static void main(String[]args) {
		
		int star =1;
		
		for(int i=1;i<=5;i++) {//outer for loop rows
			
			for(int j=1;j<=star;j++) {//inner loop column
				
				System.out.print("*");
					
			}//inner loop closed
			
			System.out.println();//curser goes to next line
			
			star++;//increment by one
						
		}
		
		
		
	}

}
