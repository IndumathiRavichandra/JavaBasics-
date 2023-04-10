package oop_inheritance;

public /*final */ class Car extends Vehicle {

	int speed = 100;
	
	public void Start() {

		System.out.println("car start");
	}

	public int Stop(int i) {
		System.out.println("car stop");
		return 100;
	}
	
	public void baseclass(String name) {
		System.out.println("baseclass in String param");
		
	}
	
	
	public void refuel() {
		System.out.println("refuel");
	}

	public static void staticMethod(){// Static Method cannot be Override
		System.out.println("staticMethod -------------car");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
