package javasessions;

import java.util.Arrays;

public class Company1 {

	public String[] EmployeeName(String name) {
		System.out.println("Getting employee devices: " + name);
		String str[] = {};
		// String str[] = new String[5];
		if (name.equals("anshul")) {
			String str1[] = { "Iphone", "Macbook Air", "Macbook Pro", "Mouse", "Keyboard" };
			// Iterate using For-Loop
			for (int i = 0; i <= str1.length - 1; i++) {
				System.out.println(str1[i]);
			}
			return str1;

		} else if (name.equals("swati")) {
			String str2[] = { "Lenovo Laptop", "Mouse", "Watch", "Android Phone" };
			// Iterate using For-each Loop
			for (String j : str2) {
				System.out.println(j);
			}
			return str2;
		}

		else if (name.equals("harsh")) {
			String str3[] = { "Mouse", "Keyboard", "Lenovo Laptop" };
			return str3;
		}

		else if (name.equals("aditi")) {
			String str4[] = { "Mouse", "Keyboard" };
			return str4;
		}

		else if (name.equals("himanshu")) {
			String str5[] = { "Lenovo Laptop" };
			return str5;
		}

		else {
			System.out.println("Employee name is not found : " + name);
		}
		return str;
	}

	public static void main(String[] args) {

		Company1 c = new Company1();
		String s1[] = c.EmployeeName("anshul");
		System.out.println("Employee Device count = " + s1.length);
		System.out.println(Arrays.toString(s1));

		System.out.println("------------------------------");

		String s2[] = c.EmployeeName("swati");
		System.out.println("Employee Device count = " + s2.length);
		System.out.println(Arrays.toString(s2));

		System.out.println("------------------------------");

		String s3[] = c.EmployeeName("harsh");
		System.out.println("Employee Device count = " + s3.length);
		System.out.println(Arrays.toString(s3));

		System.out.println("------------------------------");

		String s4[] = c.EmployeeName("aditi");
		System.out.println("Employee Device count = " + s4.length);
		System.out.println(Arrays.toString(s4));

		System.out.println("------------------------------");

		String s5[] = c.EmployeeName("himanshu");
		System.out.println("Employee Device count = " + s5.length);
		System.out.println(Arrays.toString(s5));

		System.out.println("------------------------------");

		String s6[] = c.EmployeeName("pranjal");
		System.out.println("Employee Device count = " + s6.length);
		System.out.println(Arrays.toString(s6));

	}
}