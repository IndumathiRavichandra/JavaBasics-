package oop_inheritance;

public class BMW extends Car{

	int speed = 200;

	
	@Override
	public void Start() {

		System.out.println("bmw car start");
	}
	
	@Override // same return type, same number of params.
	public int Stop(int k) {
		System.out.println("bmw stop");
		return 5;
	}
	
	
	public void autoParking() {

		System.out.println("autoParking car ---BMW");
	}
	
	@Override
	public void baseclass(String childclass) {
		System.out.println("baseclass in String param");
		
	}
	

	public static void staticMethod() {// Static Method cannot be Override
		System.out.println("staticMethod -------------bmw");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
