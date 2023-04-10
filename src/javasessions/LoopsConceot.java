package javasessions;

public class LoopsConceot {

	public static void main(String[] args) {
		System.out.println("print 1 to 10 using FOR Statement ");
		int i = 1;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);

		}
		System.out.println("print even numbers 1 to 10 using FOR Statement");
		int j = 1;
		for (j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

		System.out.println("print 15 to 20 using While Statement ");
		int k = 15;

		while (k <= 20) {
			System.out.println(k);
			++k;
		}

		System.out.println("using BREAK statement");
		for (;;) {
			System.out.println("hello");
			break;
		}

		System.out.println("print 10 to 0");
		int l = 10;
		for (l = 10; l >= 0; l--) {
			if (l % 2 == 0) {
				System.out.println(l);
			}

			System.out.println("print 1.0 to 10.0 using float data type");
			float f = 1.0F;
			while (f <= 10.0) {
				System.out.println(f);
				f++;
			}
			
			System.out.println("Do - While Concept");
			int v = 1;
			do {
				System.out.println(v);
				v++;
			}
			while (v<=10);

		}
	}

}
