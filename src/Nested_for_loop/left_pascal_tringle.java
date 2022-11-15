package Nested_for_loop;

public class left_pascal_tringle {
	
	public static void main(String[] args) {
		
			
				int space=3;
				int star=1;

				for(int i=1;i<=7;i++){//outer loop for rows

					for(int j=1;j<=space;j++){//loop for space
						
						System.out.print(" ");

					}
				for(int j=1;j<=star;j++){//for star
					
					System.out.print("*");
				}
				System.out.println();//curser next line 

				if(i<=3){//condition for increment and decrement star and space

				star++;
				space--;
				
				
				}
				else{
				star--;
				space++;
				

					}
					}

				}
		}


 
	


