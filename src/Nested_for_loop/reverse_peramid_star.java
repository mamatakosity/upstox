package Nested_for_loop;

public class reverse_peramid_star {
	
	public static void main(String[] args) {
		
	
			int space=0;
			int star=7;
			
			for(int i=1;i<=4;i++){//for rows
				
				for(int j=1;j<=space;j++) {//for space
					
					System.out.print(" ");
				}
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				System.out.println();
				star=star-2;
				space++;
				
}
}
}