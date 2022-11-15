package constructor_with_parameter;

public class demo_1 {
	
 String Bellname;
 
 int no;
 
 public demo_1( String Bellname, int no) {//constructor design
	 
	 this.Bellname=Bellname;
	 
	 this.no=no;
	 
 }//constructor design
 
 public void D() {
	 
	for(int i=1;i<=no;i++) {
		
		System.out.println("Ding Dong");
		
	}
 }
 
 
}
