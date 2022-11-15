package External_Mock;

public class Uppar_case_lower_case_count {
	public static void main(String[] args) {
		
	
	String s= "Sachin RAMBHU Lokare Name";
	int uppercount=0;
	int lowercount=0;
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)<='Z' && s.charAt(i)>='A') {
			uppercount++;
		}
		else if(s.charAt(i)<='z' && s.charAt(i)>='a') {
				lowercount++;
			}
			
		}
	System.out.println(uppercount);
	System.out.println(lowercount);
	}


}
