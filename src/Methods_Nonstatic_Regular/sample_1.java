package Methods_Nonstatic_Regular;

public class sample_1 {
	public static void main(String[] args) {
		System.out.println("NSRM call from same class");
		sample_1 a=new sample_1();
		a.m1();
	}
	
	public void m1() {
		
		System.out.println("Hii I am form same class ");
		System.out.println("Hii ");
	}

}
