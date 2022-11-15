package Array;

public class Array_1 {
	public static void main(String[] args) {
		String ar[]=new String[5];
		ar[0]="Samantha";
		ar[1]="Rashmika";
		ar[2]="sai pallavi";
		ar[3]="Niveda Thomas";
		ar[4]="Kirthy suresh";
		
		//I want to print entire data in givan array
		for(int i=0;i<=ar.length-1;i++) {
			System.out.print(ar[i]+"    ");
		}
	}

}
