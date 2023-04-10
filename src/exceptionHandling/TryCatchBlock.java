package exceptionHandling;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		TryCatchBlock objref = new TryCatchBlock();

		//objref = null;

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {

			objref.name = "Indu";
System.out.println(objref.name );
			int i = 9 / 3;
			System.out.println("hello");
		}
		/*
		catch (Exception e) {   

			e.printStackTrace();
			System.out.println("Super class Exception coming");
		}
		*/
		
		catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("AE coming");
		}

		catch (Error e) {

			e.printStackTrace();
			System.out.println("AE Error coming");
		}

		catch (NullPointerException e) {

			e.printStackTrace();
			System.out.println("NullPointerException");
		}

		

		System.out.println("Bye");


	int a[] = new int[2];
	
	try {
	
		a[0] = 1;
		a[1] = 10;
		a[2] = 10;
		a[3] = 10;
		
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception");
		e.printStackTrace();
	}
	
	
	}

}
