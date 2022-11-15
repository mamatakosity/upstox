package Collection;

import java.util.LinkedList;

public class demo_linkedlist {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(100);
		l.add(null);
		l.add(34);
		l.add(90);
		l.add("mamata");
		l.add('h');
		l.add('h');
		l.add(null);
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.remove(1));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.pollFirst());
	}

}
