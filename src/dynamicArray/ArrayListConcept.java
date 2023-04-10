package dynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList (C) -------->implements list
		// default class
		// dynamic array

		
		/* Not A Good Way of writing  
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());

		ar.add(100);// 0
		ar.add('a');// 1
		ar.add("java");// 2
		ar.add(10.10);// 3
		ar.add(true);// 4

		System.out.println(ar.get(1));

		System.out.println(ar.size());
		for (int i = 0; i <= ar.size() - 1; i++) {
			System.out.println(ar.get(i));
		}
		/*
		 * System.out.println("********************************"); 
		 * 
		 * }
		 */

		// Generics in ArrayList
		// student names
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Indu");
		stNames.add("fhdu");
		stNames.add("sdgsd");
		System.out.println(stNames.size());
		for(String rn1 : stNames) {
			System.out.println("ArrayList<String>  +  " + rn1 );
		}
		
		
		
		//Integer
		ArrayList<Integer> stMarks = new ArrayList<Integer>();
		stMarks.add(20);
		stMarks.add(200);
		stMarks.add(2000);
		System.out.println(stMarks.size());
		
		for(Integer rn2 : stMarks) {
			System.out.println("ArrayList<String>  +  " + rn2 );
		}
		

//All data types
		
		ArrayList<Object> stAll = new ArrayList<Object>();
		stAll.add("Indu");
		stAll.add(200);
		stAll.add(true);
		System.out.println(stAll.toString());
		System.out.println(stAll.size());
		System.out.println(stAll);
		
		System.out.println(stAll.size());
		for (int i = 0; i <= stAll.size() - 1; i++) {
			System.out.println(stAll.get(i));
			
			if(stAll.get(i).equals(true)){
				System.out.println("eligible for hike");
			}
		}
		
		for (Object randomname:stAll) {
			
			System.out.println(randomname);
		}
	}

}
