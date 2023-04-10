package javasessions;

import java.util.Scanner;

public class ScannerCode {

	public void CheckPrimeNumber(int num) {

		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				count++;

			}

		}

		if (count == 2) {

			System.out.println("Entered Number " + num + " is Prime Number");

		} else {

			System.out.println("Entered Number " + num + " is Not Prime Number");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				count++;

			}

		}

		if (count == 2) {

			System.out.println("Entered Number " + num + " is Prime Number");

		} else {

			System.out.println("Entered Number " + num + " is Not Prime Number");

			sc.close();

		}

		ScannerCode sc1 = new ScannerCode();
		sc1.CheckPrimeNumber(7);

	}

}
