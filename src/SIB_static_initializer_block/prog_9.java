package SIB_static_initializer_block;

public class prog_9 {
	
		public static void main(String[] args) {
			System.out.println("main start");
			
			int a=1;
			int b=1;
			System.out.println("input a= "+a);
			System.out.println("input b= "+b);
			
			if(a==1 && b==1) {
				
				System.out.println("Bulb is on");
				
			}
			else {
				
				System.out.println("Bulb is off");
			}
		
		}
		static {
			System.out.println("Static start");
			int a=1;
            if(a==1) {
				
				System.out.println("Bulb is on");
				
			}
			
		}


	


}
