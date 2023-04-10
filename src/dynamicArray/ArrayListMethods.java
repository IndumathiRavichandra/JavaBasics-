package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
	ArrayList<Integer> markList = new ArrayList<Integer>();
	
	markList.add(200);
	markList.add(400);
	markList.add(4500);
	markList.add(2200);
	markList.add(2540);
	//markList.add(null);
	
	System.out.println(markList.size());
	System.out.println(markList);
	System.out.println(markList.get(3));
	markList.add(4540);
	System.out.println(markList);
	System.out.println(markList.size());

	markList.remove(2);
	System.out.println(markList);
	System.out.println(markList.size());
	
	markList.add(2, 4500);
	
	System.out.println(markList);
	System.out.println(markList.size());
	
	
	//Collections class
	System.out.println();
	Collections.sort(markList); 
	System.out.println(markList);
	
	Collections.swap(markList, 0, 1);
	System.out.println(markList);

	System.out.println("**********************************");
	
	ArrayList<String> stNames = new ArrayList<String>();
	stNames.add("Indu");
	stNames.add("tanshu");
	stNames.add("gujja");
	System.out.println(stNames);
	Collections.sort(stNames);
	
	System.out.println("**********************************");

	ArrayList<String> stSubNames = new ArrayList<String>();
	stSubNames.add("Scence");
	stSubNames.add("englidh");
	stSubNames.add("java");
	System.out.println(stSubNames);
	Collections.sort(stSubNames);
	System.out.println("**********************************");

	
	stNames.addAll(stSubNames);
	System.out.println(stNames);
	
	
	System.out.println("**********************************");

	
	List<String> ar = new ArrayList<String>();
	List<String> currList = Arrays.asList("USD","INR", "JPY", "EUR");
	System.out.println(currList.size());
	System.out.println(currList);
	}

}
