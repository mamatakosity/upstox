package External_Mock;

public class Numbers_Descending_oder {
	public static void main(String[] args) {
		int ar[]=new int[] {1,3,9,2,6,4,6};
		int temp=0;
		for(int i=0;i<ar.length;i++) {//print array
			System.out.print(ar[i]+" ");
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;	
				}
			}
		}
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
		}

}
