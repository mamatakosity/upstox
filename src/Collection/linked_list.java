package Collection;

import java.util.LinkedList;

public class linked_list {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Ganpti");
		l.add(100);
		l.add('a');
		l.add(null);
		l.add(null);
		l.add(100);
		System.out.println(l);//print entire data
		System.out.println(l.size());//get size
		System.out.println(l.isEmpty());//check whether is empty or not
		l.add(1,"Suresh");
		System.out.println(l);//insertion//right shift
		l.remove(1);//remove 
		System.out.println(l);
		
	}

}
