package constructor_with_parameter;

public class demo_3 {
	
	String cooker;
	
	int noOfShitti;
	
	
	public demo_3(String cooker,int noOfShitti) {//constructor design start
		
		this.cooker=cooker;
		
		this.noOfShitti=noOfShitti;
		
			
	}//constructor design end
	
	public void cooking() {
		
		for(int i=1;i<=noOfShitti;i++) {
			
			System.out.println("Shurrr");
			
			System.out.println("Rice is cooked");
			
		}
	}
	
	

}
