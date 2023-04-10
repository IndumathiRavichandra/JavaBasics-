package oop_encapasulation;

public class LoginPage {

	private String userName;
	private String password;
	public String role;

	public LoginPage(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getpassword() {
		return password;
	}
	
	
	public void getInfo() {
		System.out.println("getInfo");
	}
	

	
	public String getInfo2() {
		return userName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
