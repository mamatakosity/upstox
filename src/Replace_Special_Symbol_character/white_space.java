package Replace_Special_Symbol_character;

public class white_space {
	public static void main(String[] args) {
		
		String name="M A M A T A";
		int count=0;
		for(int i=0;i<=name.length()-1;i++){
			char s=name.charAt(i);
			if(s==' ') {
				count++;
			}
			
		}
		System.out.println("total no of count  "+count);
	}

}
