package Collection;

import java.util.LinkedHashSet;

public class demo_linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add(100);
		l.add(100);//does not allow duplicate
		l.add("mamata");
		l.add('a');
		l.add(null);
		l.add(null);//accept only one null value
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l);
		
		
				
		
	}

}
