package Collection;

import java.util.LinkedHashSet;

public class linked_hash_set {
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("rinki");
		lh.add("pinki");
		lh.add('a');
		lh.add(100);
		lh.add(null);
		lh.add(null);//allow only one null
		System.out.println(lh);//print entire data
		System.out.println(lh.size());//get size
		System.out.println(lh.isEmpty());//check whether is empty or not
		
		
				
		
	}

}
