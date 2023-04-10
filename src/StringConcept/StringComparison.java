package StringConcept;

import java.util.Arrays;

public class StringComparison {

	public static void main(String[] args) {

		String t1 = "hello World";
		String t2 = "hello world";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));

		System.out.println(t1 == t2);

		String t3 = new String("hello naveen");

		System.out.println(t1 + t2);
		System.out.println(t1.toUpperCase() + t2);

		// contains

		String pop = "hello amazon application";
		System.out.println(pop.contains("amazon"));

		String name = "  hello   ";

		if (name.equals("hello")) {

			System.out.println("same");
		}

		else if (name.trim().equals("hello")) {

			System.out.println("trim and correct");
			System.out.println(name.trim());
		}

		else {

			System.out.println("not same");

		}

		String h2 = "Hello World";
		System.out.println(h2.replace("Hello", " Hi "));

		String dob = "01-01-2023";
		String newdob = dob.replace("-", "/");
		System.out.println(newdob);

		String replacepop = "hello amazon application";
		System.out.println(replacepop.replace("i", " Hiii "));

		StringBuilder sb1 = new StringBuilder("Indu");
		sb1.append("Hello");
		System.out.println(sb1);

		StringBuilder compare = new StringBuilder("Compare Strings using StringBuffer");
		StringBuilder compare1 = new StringBuilder("Compare Strings using StringBuffer");

		System.out.println(compare == compare1); // false ---wont work for StringBuilder
		System.out.println(compare.equals(compare1)); // false ---wont work for StringBuilder

		System.out.println(compare.toString().equals(compare1.toString()));

		String p1 = "Selenium";
		StringBuilder sp1 = new StringBuilder(p1);
		sp1.append("testing");
		System.out.println(sp1);

		// split

		String sl = "java_python_do";
		String sp[] = sl.split("_");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		// System.out.println(sp[5]);----------------------//ArrayIndexOutOfBoundsException

		String pool = "xXjavaxXpythonxXdoxXsdlfjXxXafhlkfj";
		String newsplit[] = pool.split("xX");
		System.out.println("Beginning split so nothing there " + " : " + newsplit[0].length()); // beginning split
		System.out.println(newsplit[1]);
		System.out.println(newsplit[1].length());
		System.out.println(newsplit[2]);
		System.out.println(newsplit[3]);
		System.out.println(newsplit[4]);
		System.out.println(newsplit[5]);

		String data = "tom;peter;30;pune;India;SDET";
		String splittt[] = data.split(";");
		System.out.println(splittt[0]);
		System.out.println(splittt[1]);
		System.out.println(splittt[2]);
		System.out.println(Arrays.toString(splittt));

		// Reverse

		String test = "Selenium";
		StringBuilder buil = new StringBuilder(test); // reversing using StringBuilder
		System.out.println(buil.reverse());

		int length = test.length(); // reversing using String and not using StringBuilder
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {

			rev = rev + test.charAt(i);

		}
		System.out.println(rev);
	

	// subString

	String message = "Your name is Indumathi";
	String newStr = message.substring(10);
	System.out.println(newStr);
	
	String newStr1 = message.substring(message.indexOf("nd") + 2 , message.length());
	System.out.println(newStr1);
	
	
	String newStr2 = message.substring(message.indexOf("is") + 2); // start 2 position next to is
	System.out.println(newStr2);

	}

}
