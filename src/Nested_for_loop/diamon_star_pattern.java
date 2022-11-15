package Nested_for_loop;

public class diamon_star_pattern {
	
	public static void main(String[] args) {
	
		int star=1;
		int space =3;
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=space;j++) {//for space 
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {//for star
				
				System.out.print("*");
			}
			
			System.out.println();
			if(i<=3) {//i=row no.
				star=star+2;
				space--;
			}
			else {
				star=star-2;
				space++;
			}
		}
	}
	
	

}
