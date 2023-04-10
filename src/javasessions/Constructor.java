package javasessions;

public class Constructor {

	
	public Constructor() {
		System.out.println("no param or default constructor or 0 param");
	}
	public Constructor(int i) {
		System.out.println(" 1 param " + i);
	}
	
	public Constructor(int i, int j) {
		System.out.println(" 2 param " + i + j);
	}
	
	public void functionmethod() {
		System.out.println("method function calling");
	}
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		c1.functionmethod();
		Constructor c2 = new Constructor(1012);
		c2.functionmethod();
		Constructor c3 = new Constructor(10000,12);
		c3.functionmethod();
	}

}
