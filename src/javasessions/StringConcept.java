package javasessions;

public class StringConcept {
	public static void main(String[] args) {

		String s = "hello world";
		System.out.println(s);
		
		String s1 = "100";
		System.out.println(s1+20);
		System.out.println("**************");
		
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 22.33;
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+a+b+d1+d2); //300HelloSelenium10020012.3322.33
	
		char c1 = 't';
		System.out.println(x+c1);
		
		System.out.println("the sum of a + b : " + a+b); // wont print sum
		System.out.println("the sum of a + b : " + (a+b));
	
		
		String n  = null;
		System.out.println(n);
	}
}
