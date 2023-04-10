package builderPattern;

public class Employee extends Company {

	String name;
	int id;
	double salary;

	public Employee() {

		super();
		System.out.println("emp constructor");
	}

	public Employee(String name, int id, double salary) {
		
		super(name, salary);
		this.name = name;
		this.id = id;
		this.salary = salary;

	}
	
	

	public static void main(String[] args) {
		
		Employee e1= new Employee("indu" , 23, 10000);
				
		System.out.println(e1.name + " " + e1.id+ " " + e1.salary  );
	}

}
