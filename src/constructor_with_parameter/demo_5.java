package constructor_with_parameter;

public class demo_5 {
	
	String school;
	
	int bell;
	
	public demo_5(String school,int bell) {
		
		this.school=school;
		
		this.bell=bell;
		
	}
	
	public void schoolbreak() {//reg schoolbreak method start
		
		for(int i=1;i<=bell;i++) {
			
			System.out.println("Tan-Tan");
		}
		
	}//reg schoolbreak method end
	
	public void schoolbreak1() {
		
		for(int i=1;i<=bell;i++) {
			
			System.out.println("Tan-Tan");
			
		}
	}

}
