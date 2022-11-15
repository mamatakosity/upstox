package Array;

public class demo1 {
	public static void main(String[] args) {
		String ar[]=new String [4];
		ar[0]="Mamata";
		ar[1]="pranav";
		ar[2]="chetan";
		ar[3]="hii";
		//ar[4]="bye";
		//System.out.println(ar[4]);//ArrayIndexOutOfBoundsException
		for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}

}}
