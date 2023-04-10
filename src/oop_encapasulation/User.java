package oop_encapasulation;

public class User {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("abcd");
		System.out.println(e.getName());
		
		e.setAge(3);
		System.out.println(e.getAge());
		
		e.setSalary(21545.00);
		System.out.println(e.getSalary());
		
		System.out.println("*************");
		
		Browser br = new Browser();
		br.launchBrowser(); 
		
		
		//POST call
	Customer c1 = new Customer("indu", "i.gmail.com", 3);
	
	//GET call
	System.out.println(c1.getName());
	System.out.println(c1.getUserId());
	System.out.println(c1.getEmail());
	
	System.out.println("*************");
	//PUT/PATCH call
	c1.setName("gooj");
	
	
	//GET call
	System.out.println(c1.getName());
	System.out.println(c1.getUserId());
	System.out.println(c1.getEmail());
	
	
	}
	
	

}
