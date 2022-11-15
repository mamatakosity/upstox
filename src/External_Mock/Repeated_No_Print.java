package External_Mock;

public class Repeated_No_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12346464";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			count=0;
			
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>=2) {
			System.out.println(s.charAt(i));
		}

}
}}