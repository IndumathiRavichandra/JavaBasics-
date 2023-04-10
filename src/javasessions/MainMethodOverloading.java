package javasessions;

public class MainMethodOverloading {

	public static void main(String p[] ) {
		System.out.println("hi");
		MainMethodOverloading.main("asd");
	}
	public static void main(String p) {
		System.out.println("hi 2nd");
	}

	public static void main(int i ) {
		System.out.println("i");

	}

	
	public static void main(String p, int i) {
		System.out.println("2 params");

	}

}
