package Collection;

import java.util.ArrayList;

public class demo_arraylist {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
	a.add(100);
	a.add("mamata");
	a.add('a');
	a.add(100);
	a.add(null);
	a.add(null);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.isEmpty());
	System.out.println(a.get(1));
	System.out.println(a.indexOf('a'));
	//a.clear();
	System.out.println(a);
	a.remove(2);
	System.out.println(a);
	a.add("hii");
	System.out.println(a);
	
	}

}
