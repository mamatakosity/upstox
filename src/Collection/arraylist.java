package Collection;

import java.util.ArrayList;

public class arraylist {//dont confuse here we are talking abt inbuilt class
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ankush");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null); 
		System.out.println(al);//print all data in class
		System.out.println(al.size());//6//get size
		System.out.println(al.isEmpty());//check whether is empty or nor
		al.add(3,500);//insertion operation
		System.out.println(al);
		al.remove(3);//remove the opration
		System.out.println(al);
		al.remove(1);
		
		
		
	}

}
