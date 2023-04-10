package oop_encapasulation;

public class Employee {

	
	private String name; // cannot access outside this class
	private int age;
	private double salary;
	
	
	//public methods: getter and setter:
	
	//name
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
	//age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//salary
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Indu";
		e.age = 25;
		e.salary = 15000;
	}

}
