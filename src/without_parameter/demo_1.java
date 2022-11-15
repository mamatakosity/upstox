package without_parameter;

public class demo_1 {
	

	String gunName;
	int noOfBullets;
	
	public demo_1(String gunName,int noOfBullets) {
		
	
		this.gunName=gunName;
		
		this.noOfBullets=noOfBullets;
	}
	
	public void shoot() {
		
	
		for(int i=1;i<=noOfBullets;i++) {
			
		
			System.out.println("Deshkew");
			
		}

	}
}