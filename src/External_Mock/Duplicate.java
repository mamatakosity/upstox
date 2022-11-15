package External_Mock;


public class Duplicate {
	public static void main(String[] args) {
	  
        int [] arr = new int [] {1, 2, 3, 4, 4, 2, 7};    //Initialize array 
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length-1; i++) {  
            for(int j = i + 1; j < arr.length-1; j++) {  
                if(arr[i] ==arr[j])  {
                    System.out.println(arr[j]);  
            }  
               
        }  
    } 
}}


