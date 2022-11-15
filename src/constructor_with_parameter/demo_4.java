package constructor_with_parameter;

public class demo_4 {
	
	String cooker;
	
	int whistle;
	
	public demo_4(String cooker,int whistle) {
		
		this.cooker=cooker;
		
		this.whistle=whistle;
		
	}

	public void cooking() {
		
		for(int i=1;i<=3;i++) {
			
			System.out.println("Shoooooor");
		}
	}
}
