package Map;

import java.util.Hashtable;

public class demo_hashmap {
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(1, "mamata");
		h.put(2, "pranav");
		h.put(4, "panu");
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.remove(1));
		System.out.println(h);
	}

}
