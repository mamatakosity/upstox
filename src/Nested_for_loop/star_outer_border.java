package Nested_for_loop;

public class star_outer_border {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {//row
			
			for(int j=1;j<=4;j++) {//column
				
				if(i==1 ||i==3 ||j==1||j==4) {
					
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}
