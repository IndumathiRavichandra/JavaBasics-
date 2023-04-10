package javasessions;

public class SwitchcaseLogic1 {

	public static void main(String[] args) {
		
		// cross browser testing
		// weekdays
		// environment - qa, dev, stage, prod, uat
		//switch case wont work with long, boolean, double, float
		// characters allowed because ASCII values converted in form of integers
		
		
		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			//break;
		default:
			System.out.println(ch + " is not vowel");
			break;
		}

	}

}
