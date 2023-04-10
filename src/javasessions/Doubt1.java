package javasessions;

public class Doubt1 {

	public static void main(String[] args) {

		char a = '9';
		char b = '3';

		int num1 = a;
		int num2 = b;

		System.out.println(num1); // output ASCII values
		System.out.println(num2);

		System.out.println(num1 - num2);
		System.out.println(num1 + num2);

		// Type Conversions
		long l = 121212121L;
		long l1 = 36256145L;

		int n1 = (int) l;
		int n2 = (int) l1;
		System.out.println(n1);
		System.out.println(n2);

		char c = 'a';
		if (c == 'a') {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

		char c1 = 'a';
		if (c1 == 97) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

		float h1 = 1.12f;
		float h2 = 22.1f;
		System.out.println(h1 + h2); // exact binary calculation 23.220001
		
		System.out.println("***************************");

		System.out.println("print a to z");
		for (char p = 'a'; p <= 'z'; p++) {
			System.out.print(p);
		}
		System.out.println("***************************");
		for (char p = 'A'; p <= 'Z'; p++) {
			System.out.print(p);
		}
		System.out.println("***************************");
		for (char p = 'a'; p <= 'z'; p++) {
			System.out.println(p + " = " + (int) p); //or below statement 
		}
		System.out.println("***************************");
		for (char p = 'a'; p <= 'z'; p++) {
			System.out.println(p + 0);
		}
	}

}
