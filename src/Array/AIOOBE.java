package Array;

public class AIOOBE {
	
		public static void main(String[] args) {
			String ar[]=new String[5];
			ar[0]="Samantha";            //its take only homogeneous data
			ar[1]="Rashmika";
			ar[2]="sai pallavi";
			ar[3]="Niveda Thomas";
			ar[4]="Kirthy suresh";
			System.out.println(ar[5]);
			//print the data which is not present 
			/*try {
			System.out.println(ar[5]);//AIOOBE
		}
			catch(ArrayIndexOutOfBoundsException donky) {
				System.out.println("Idiot there is no data still u r trying to fetch it means u r waste fellow");
			}*/
		}

}
