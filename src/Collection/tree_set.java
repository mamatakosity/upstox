package Collection;

import java.util.TreeSet;

public class tree_set {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(800);
		t.add(700);
		t.add(300);
		t.add(200);
		t.add(100);
		t.add(500);
	
		System.out.println(t);//it arrange ascending order data
		t.pollLast();
		System.out.println(t);//delete last no
		t.pollFirst();
		System.out.println(t);//delete first no
	}

}
