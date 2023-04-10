package oop_abstract;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("LP title");
		
	}

	@Override
	public void url() {
		System.out.println("LP url");
		
	}

	public void doLogin() {
		System.out.println("user is logged in ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
