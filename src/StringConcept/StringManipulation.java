package StringConcept;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "testing";
		String s1 = "100";
		String str = "hi this is my code";
		
		System.out.println(s.length());

		System.out.println(s1.length());

		System.out.println(str.length());
		
		int length = str.length();
		int li = 0; //lowest index
		int hi = length - 1;
		System.out.println("Lowest Index " + li);
		System.out.println("Highest Index " + hi);
		System.out.println("length = " + length);

		
		System.out.println(str.charAt(6));
		//System.out.println(str.charAt(25)); StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('i' , 2));
		
		System.out.println(str.indexOf("this"));
		System.out.println(str.indexOf("world"));
	
	
		
		String message = "Indu is good";
		if(message.indexOf("Indu") != -1) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
	}

}
