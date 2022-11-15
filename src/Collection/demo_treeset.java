package Collection;

import java.util.TreeSet;

public class demo_treeset {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(100);
		t.add(100);//does not allow duplicate
		t.add(45);
		t.add(67);
		System.out.println(t);//order of insertion ascending
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		t.clear();
		System.out.println(t);
		
	
	}

}
