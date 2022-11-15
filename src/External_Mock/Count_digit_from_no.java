package External_Mock;

public class Count_digit_from_no {
	public static void main(String[] args) {
		int num=2783973;
		int count=0;
		int r=0;
		while(num>0) {
			r=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
