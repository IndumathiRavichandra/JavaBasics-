package javasessions;

public class Students_MethodOverloading {

	public void test() {
		System.out.println("0 param");

	}

	public void test(int i) {
		System.out.println("1 param");

	}
	
	/*
	public int test(int i) {----------------------- VOID or RETURN type doesnt matter----------
		System.out.println("1 param");
		return i;
	}
	
	
	public void test(int k) {----------------------- same data type----------
		System.out.println("1 param");

	}
	*/

	public void test(String i) {
		System.out.println("1 string param");

	}

	public void test(String i, int p) {
		System.out.println("1 string param");

	} 
	
	public void test(  int p,String i) {
		System.out.println("1 string param");

	} 
	public static void main(String[] args) {

		
		Students_MethodOverloading smo = new Students_MethodOverloading();
		smo.test();
		smo.test(4);
		smo.test("indu");
		smo.test(5, "abc");
		smo.test("abc", 5);
	}

}
