package Create_object;

public class demo_1 {
	int a= 10;
	
	public static void main(String[] args) {
		
		demo_1 s=new demo_1();//object create
		
		System.out.println(s);//Sample@10345t54tt//when we are print only ref variable then address print
		
		System.out.println(s.a);//s=10

		demo_1 y=new demo_1();//object create
		
		System.out.println(y); //here print address
		
		System.out.println(s.a);//y=10
	}

}
