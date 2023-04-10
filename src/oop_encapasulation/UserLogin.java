package oop_encapasulation;

public class UserLogin {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("indu", "null", "admin");
		
		
		System.out.println(lp.getUserName());
		System.out.println(lp.getpassword());
		System.out.println(lp.role);
		
		
		lp.setpassword("asdf123");
		System.out.println(lp.getpassword());
		System.out.println("************");
		
		
LoginPage lp1 = new LoginPage("indu", "null", "admin");
		
		
		System.out.println(lp1.getUserName());
		System.out.println(lp1.getpassword());
		System.out.println(lp1.role);
		
		
		lp1.role = "seller";
		System.out.println(lp1.role);
		
		System.out.println("************");
		
		
		LoginPage lp2 = new LoginPage("indu", "null", "admin");
				
				
		lp2.getInfo();
		String un = lp2.getInfo2();
System.out.println(un);
	}

}
