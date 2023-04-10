package javasessions;

public class LoginPage {

	
	String username;
	String password;
	
	public LoginPage(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("Enter user name : " + username );
		System.out.println("Enter password : " + password );
		System.out.println("click on login button : ");
		System.out.println("user is logged in");
	}
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("Indu","123456");
		System.out.println(lp.username + lp.password);
		lp.doLogin();
		
		System.out.println("*******************************");
		
		LoginPage lp1 = new LoginPage("sgfsdg","sdgsdgsdg");
		System.out.println(lp1.username + lp1.password);
		
		
		lp.doLogin();
	}

}
