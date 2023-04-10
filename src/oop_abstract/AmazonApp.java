package oop_abstract;

public class AmazonApp {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.doLogin();
		LoginPage.pageStyle(); // static method	
		lp.pagetimOut();
		
	}
		

}
