package hashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Tom", "IBM");
		map.put("Peter", "Google");
		map.put("Ravi", "CTS");
		map.put("Peter", "Oracle");
		map.put("Naveen", null);
		map.put("Indu", "Apple");
		map.put(null, null);
		
		
		System.out.println(map.get("Peter")); //Oracle  updated last value 
		System.out.println(map.get("Aman")); //null
		System.out.println(map.get("Naveen"));// null
		System.out.println(map.get("Indu")); //Apple
		System.out.println(map.get(null));
		
		
		//to print all
		System.out.println(map);
	}

}
