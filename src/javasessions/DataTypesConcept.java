package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {

		System.out.println("BYTE");
		byte b = 10;
		byte a = 20;
		System.out.println("value of b is " + b);
		b = 30;
		System.out.println("value of b is " + b);
		System.out.println("value of a is " + a);
		
		
		System.out.println("long data type");
		long c = -220;
		System.out.println(c + 50);

		short indu = 300;
		short in = 300;
		int i = indu + in;
		System.out.println(i);
		System.out.println("float data type");
		float f = 100;
		float g = 1.1F;
		System.out.println(f);
		System.out.println(f + g);

		System.out.println("double data type");
		double x = 100;
		double y = 1.1d;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x + y);

		char c1 = 'a';
		char c2 = '1';
		char c3 = '$';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1+c2);

		System.out.println(c3);
		System.out.println((int)c1);
		System.out.println((int)c3);
		
		
		System.out.println("Boolean data type");
		boolean bool = true;
		boolean userIsActive = true;
		
		System.out.println(bool);
		System.out.println(userIsActive);
	}

}
