package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3];
		a[0] = 5;
		a[1] = 15;
		a[2] = 25;

		System.out.println(a[0]);
		System.out.println("length is " + a.length);
		System.out.println(Arrays.toString(a));
		System.out.println("OR");

		int len = a.length;
		for (int k = 0; k <= len - 1; k++) {
			System.out.println(a[k]);
		}
		System.out.println("OR");

		for (int k = 0; k < 3; k++) {
			System.out.println(a[k]);
		}

		System.out.println("while loop....................");

		int p = 0;
		while (p <= len - 1) {
			System.out.println(a[p]);
			p++;

		}

		for (int k = 0; k <= len - 1; k++) {
			System.out.println(a[k]);

			if (a[k] == 5) {
				System.out.println("pass");
				break;
			}

		}
		double d[] = new double[3];
		d[0] = 5.5d;
		d[1] = 15.5d;
		d[2] = 25.5d;

		for (int t = 0; t <= d.length - 1; t++) {
			System.out.println(d[t]);
		}

		char c[] = new char[2];
		c[0] = 'a';
		c[1] = '$';

		String emp[] = new String[3];
		emp[0] = "Indu";
		emp[1] = "Anu";
		emp[2] = "Tanu";

		
	System.out.println("total employees" + " " + emp.length);
	System.out.println(Arrays.toString(emp)); //without for loop
	}

}
