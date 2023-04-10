package exceptionHandling;

public class FinalKeyword {

	public static void main(String[] args) {
		
		
		try {

			int i = 9 /0;
			System.out.println("hello");
		}
		
			catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("AE coming");
		}
	
		finally {
			
			System.out.println("finally");
		}

		System.out.println("logout");
	}

}
