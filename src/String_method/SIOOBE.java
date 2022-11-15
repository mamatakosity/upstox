package String_method;

public class SIOOBE {
	public static void main(String[] args) {
		String s="velocity";
		try {
			System.out.println(s.charAt(8));//we r trying to fetch data which is not present
		}
		catch(StringIndexOutOfBoundsException a){//a is ref variable
				System.out.println("Idiot there is no data u trying to fetch");
	}
		//Thread.sleep(3000);//wait for 3 sec
		System.out.println("hi");
	}

}
