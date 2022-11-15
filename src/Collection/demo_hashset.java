package Collection;

import java.util.HashSet;

public class demo_hashset {
	public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(100);
	h.add(100);//duplicates not allowed
	h.add("mamata");
	h.add('a');
	h.add(null);//its allow only one null 
	h.add(null);
	System.out.println(h);
	System.out.println(h.size());
	System.out.println(h.isEmpty());
	h.remove(100);
	System.out.println(h);
	
	h.clear();
	System.out.println(h);
	}
}
