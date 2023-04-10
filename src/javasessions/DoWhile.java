package javasessions;

public class DoWhile {

	public static void main(String[] args) {

		int v = 1;
		do {
			System.out.println(v);
			v++;
			if (v == 5) {
				break;
			}

		} 
		while (true);
		System.out.println("********");
	}
}
