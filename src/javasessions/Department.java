package javasessions;

public class Department {

	public void sendMail() {
		System.out.println("Send mail");
	}
	
	public static void getInfo() {
		System.out.println("getInfo");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Department d = new Department();
		d.sendMail();
		getInfo();
		Department.getInfo();
	}

}
