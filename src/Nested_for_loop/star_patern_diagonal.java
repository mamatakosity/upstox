package Nested_for_loop;

public class star_patern_diagonal {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(i==j) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}//inner loop
			
			System.out.println();
		}
	}

}
