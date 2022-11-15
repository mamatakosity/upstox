package Map;

import java.util.Hashtable;

public class hashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable <Integer, String>();
		h.put(101,"mamata");//1 st entry
		h.put(102, "pranav");
		h.put(103, "chanda");
		h.put(104,"manda");
		System.out.println(h);//print entire data//print reverse order
		h.remove(104);
		System.out.println(h);
		
	}

}
