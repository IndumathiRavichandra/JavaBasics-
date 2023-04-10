package javasessions;

public class HomeworkConstructor {

	String firstName;
	String lastName;
	String email;
	String telephone;
	String password;
	String passwordConfirm;
	
	public HomeworkConstructor(String firstName, String lastName, String email, String telephone, String password,
			String passwordConfirm) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}


	
	public void Login() {
		 
		System.out.println("Enter firstName: " + firstName);
		System.out.println("Enter lastName: " + lastName);
		System.out.println("Enter email: " + email);
		System.out.println("Enter telephone: " + telephone);
		System.out.println("Enter password: " + password);
		System.out.println("Enter password Confirm:  " + passwordConfirm);
		System.out.println("***********************");
		System.out.println("Successfully login");
	}

	
	
	
	public static void main(String[] args) {
		
		HomeworkConstructor hwc = new HomeworkConstructor("indu","r","r.gmail.com","41616161455","12356","12356");
		System.out.println(hwc.firstName + " " +hwc.lastName + " " + hwc.email + " " + hwc.telephone + " " + hwc.password + " " + hwc.passwordConfirm);

		
		hwc.Login();
	}

}
