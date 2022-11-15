package Collection;

import java.util.Vector;

public class demo_vector {
	public static void main(String[] args) {
		Vector v=new Vector();//type vect then ctrl+space then click on java util
		v.add(1);
		v.add('a');
		v.add("manu");
		v.add(null);
		v.add(null);
		v.add(1);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		v.remove(2);
		System.out.println(v);
		v.add(100);
		System.out.println(v);
		v.add(3, 100);
	}

}
