package static_nonstatic_variable;

public class demo9 {
	
	static float g=56f;
	
	float h=45f;
	
	public static void main(String[] args) {
		
		System.out.println(g);
		
		demo9 s=new demo9();
		
		System.out.println(s.h);
	}
	
	
	

}
