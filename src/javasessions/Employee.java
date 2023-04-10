package javasessions;

public class Employee {

	String name;
	int age;
	double salary;
	boolean isPerm;
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name="Indu";
		emp.age = 25;
		emp.salary= 10000.00;
		emp.isPerm = true;
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println(emp.isPerm);
		

		Employee emp1 = new Employee();
		emp1.name="Anu";
		emp1.age = 23;
		emp1.salary= 10000.00;
		emp1.isPerm = false;
		
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		System.out.println(emp1.isPerm);
		
		System.out.println("**************another way of creating class");
		new Employee().age = 26;
		new Employee().name = "Aradhya" ;
		new Employee().isPerm = true;
		//System.out.println(new Employee().name);
		
		
		Employee emp2 = new Employee();
		// emp2 = null; //null pointer exception
		emp2.age = 23;
		emp2.salary= 10000.00;
		emp2.isPerm = false;
		System.out.println(emp2.age);
		
		Employee emp5 = null;
		System.out.println(emp5.name);// null value
		
	}

}
