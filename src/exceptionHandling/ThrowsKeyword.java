package exceptionHandling;

public class ThrowsKeyword {

	public void m1() throws ArithmeticException {
		System.out.println("---------m1");
		m2();
	}

	public void m2() throws ArithmeticException {
		System.out.println("---------m2");
		
		try {
			
			m3();
		}
		catch(ArithmeticException e) {
			System.out.println("AE catch the mistake");
			e.printStackTrace();
			
			
		}
		
	}

	public void m3() throws ArithmeticException {
		System.out.println("----------m3");
		int i = 9/0;
	}

	public static void main(String[] args) {

		
		ThrowsKeyword tk = new ThrowsKeyword();
		
		tk.m1();
		
		
/*
		try {
			tk.m1();
		}
		catch(ArithmeticException e) {
			System.out.println("AE catch the mistake");
			e.printStackTrace();
			
			
		}
		*/
		
		System.out.println("Bye");
		/*
		tk.m1(); // 1 2 3
		
		System.out.println("----------");

		tk.m2();// 2 3
		
		System.out.println("----------");

		tk.m3(); //3
		*/
	}

}