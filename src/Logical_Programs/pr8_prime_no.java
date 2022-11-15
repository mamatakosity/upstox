package Logical_Programs;

public class pr8_prime_no {
	public static void main(String[] args) {
		int num=5;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The given no is Prime No");
		}
		else {
			System.out.println("the no is not prime no.");
		}
	}

}
