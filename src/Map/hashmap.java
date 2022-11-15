package Map;

import java.util.HashMap;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer,String>();
		m.put(1,"hii");
		m.put(2, "hello");
		m.put(3, "bye");
		System.out.println(m);//print all data
		m.remove(3);
		System.out.println(m);
	}

}
