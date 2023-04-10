package javasessions;

public class MethodCalling {
	
	public void m1() {
		System.out.println("m1");
		m2();
		
	}
	public void m2() {
		System.out.println("m2");
		m3();
	}
	
	public void m3() {
		System.out.println("m3");
		m1();
	}

	public static void main(String[] args) {
		
		MethodCalling mc = new MethodCalling();
		mc.m1();

	}

}
