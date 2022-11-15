package Nested_for_loop;

public class left_tringle_star {
	
	public static void main(String[] args) {
		
		int space =4;
		
		int star=1;
		
		for(int i=1;i<=5;i++) {//for row
			
			for(int j=1;j<=space;j++) {//column
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();//curser goes to next
			
			space--;
			star++;
		}
	}

}
