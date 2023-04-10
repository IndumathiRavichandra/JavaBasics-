package javasessions;

import java.util.Arrays;

public class ArraysConcept2 {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0] = 5;
		a[1] = 15;
		a[2] = 25;
	
		for(int n : a) {
			System.out.println(n);
		}
		
		
		
		
		
		String emp[] = new String[3];
		emp[0] = "Indu";
		emp[1] = "Anu";
		emp[2] = "Tanu";
		
		for (int name = 0; name <=emp.length-1; name++) {
			System.out.println(emp[name]);
			if(emp[name].equals("Tanu")) {
				System.out.println("She is a mgr");
			}
		}
		
		
		  
		
		String employee[] = new String[4];
		employee[0] = "kkk";
		employee[1] = "aaa";
		employee[2] = "ttt";
		employee[3] = "lll";
		
		System.out.println(Arrays.toString(employee));
		
		
		for(String randomno : employee) {
			System.out.println(randomno);
			
		}
		
		System.out.println(employee.length);
		
		
		
		int p[] = {1,2,3,4,5};
		System.out.println(p.length);
		System.out.println("Lowest Index   " + 0);
		System.out.println("Highest Index   " + (p.length-1));
		
		
		
		String name[] = {"abc", "def"};
		System.out.println(name.length);
		System.out.println(Arrays.toString(name));
	}
	
	
	

}
