package External_Mock;

public class Count_no_digit {
	public static void main(String[] args) {
		
		//first way
		int num= 1234;
		int count=0;
		while(num !=0) {
			num=num/10;
			count++;	
		}
		
      System.out.println(count);
	}
	

		
	

}
