package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		if(i==j) 
		{
			System.out.println("pass - print equal");
		}
		
		else {
			System.out.println("Fail - Not equal");
		}
		
		// DEAD CODE
		if(true) {
			System.out.println("Hai");
		}
		
		else 
		{
			System.out.println("Bye");
		}
		

		boolean flag = false;
		if(flag) {
			System.out.println("Hello");
		}
		
		else {
			System.out.println("Bye!!");
		}
		
		System.out.println("***************************");
		System.out.println("***************************");
		
		
		int marks = 100;
		if (marks >= 90)
		{
			if (marks >=95) {
				
				System.out.println("Grade A++");
			
			
			if (marks == 100)
			{
				System.out.println("eligible for scholarship");
			}
			else {
				System.out.println("not eligible for scholarship");
			}
			}
			else {
			
			System.out.println("Grade A");
			}
		}
		else {
			System.out.println("Grade B");
		}
		
		
		String s1 = "Selenium";
		String s2 = "Selenium";
		if (s1.equals(s2)) {
			System.out.println("pass");
		}
		else {
			System.out.println("pass");
		}
		System.out.println("**********************");
		System.out.println(10==10);
	}

}
