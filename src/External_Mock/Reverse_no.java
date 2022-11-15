package External_Mock;

public class Reverse_no {
	public static void main(String[] args) {
		int num=534;
	    int reverse=0;
	    int r=0;//remaining
	    while(num>0) {
	    	 r=num%10;   // r=4    r=3   r=5
	    	 reverse=reverse*10+r; // rev=4    rev=43   rev=435
	    	 num=num/10;   //num=53     num=5
	    }
	    System.out.println(reverse);

}
}
