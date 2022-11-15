package Armstrong_number;

public class demo3 {
	public static void main(String[] args) {
		int num=153;
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;//r=(153%10)=3
			armnum=r*r*r+armnum;//armnum=3*3*3+0=27
			num=num/10;//153/10=15
			
		}
		if(armnum==actnum) {
			System.out.println("The given no is amstrong");
		}
		else {
			System.out.println("The no is not amstrong");
		}
	}

}
