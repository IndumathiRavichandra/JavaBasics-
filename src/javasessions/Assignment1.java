package javasessions;

public class Assignment1 {

	public static void main(String[] args) {

		System.out.println("WAP to print following output:");
		for (int i = 0; i <= 5; i++) {

			System.out.println("I am Batman");

		}

		System.out.println("WAP to print following output:");

		for (int i = 1; i < 10; i++) {

			System.out.println("I am Batman " + i);

		}

		System.out.println("WAP to print 10 to 1 using do-while loop");
		int k = 10;
		do {

			System.out.println(k);
			k--;
		} while (k >= 1);

		System.out.println("WAP to print 10 to 1 using while loop");
		int m = 10;
		while (m >= 1) {
			System.out.println(m);
			m--;
		}
		System.out.println("WAP to print 10 to 1 using For loop");

		for (int n = 10; n >= 1; n--) {
			System.out.println(n);
		}

		System.out.println("4. Write a program in Java to print \"Hello World\" ten times using while loop");
		int a = 1;
		while (a <= 10) {

			System.out.println("Hello World");
			a++;
		}

		System.out.println("5. Write a program in Java to print 1 to 10 using while loop");

		int b = 1;
		while (b <= 10) {
			System.out.println(b);
			b++;
		}

		System.out.println("6. WAP to find out the max number from the given positive numbers");

		int n1 = 5;
		int n2 = 45;
		int n3 = 453;
		int n4 = 65;

		if (n1 >= n2 && n1 >= n3 && n1 >= n4) {

			System.out.println(n1);
		}

		else if (n2 >= n1 && n2 >= n3 && n1 >= n4) {
			System.out.println(n2);

		} else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
			System.out.println(n3);
		} else if (n4 >= n1 && n4 >= n2 && n4 >= n3) {
			System.out.println(n4);

		}

		System.out.println("7. print all odd and even numbers between 1 to 100");

		for (int o = 1; o <= 100; o++) {

			if (o % 2 == 1) {
				System.out.println(o);

			}

		}
		System.out.println("8. What will be the output of this program:"); // keep printing "Hi Java" since there is no
																			// incrementing
		// int i = 1;

		// while (i <= 1)

		// System.out.println("Hi Java");

		System.out.println(
				"??????????????????????9. Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.");

		for (int i = 65; i <= 90; i++) {
			System.out.println(" The ASCII value of " + (char) i + "  =  " + i);

		}

		System.out.println("10. Print this series: \r\n" + "\r\n" + "1.0 2.0 3.0  ...... 10.0 p");

		float f = 1.0f;
		while (f <= 10.0) {
			System.out.println(f);
			f++;
		}

		System.out.println(
				"11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message \"bye, see you tomorrow\".");

		for (int o = 1; o <= 10; o++) {
			System.out.println(o);

			if (o % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;

			}

		}
	}
}
