package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		
		b.Start(); //overridden
		b.autoParking();//individual
		
		b.refuel();//inherited
		b.Stop(5 );
		
		b.baseclass("null");// Overridden
		System.out.println("**************");

		
		BMW.staticMethod();
		
		b.Vehicleengine();
		
		System.out.println(b.speed);
				
		System.out.println("**************");
		
		
		
		Car c = new Car();
		c.Start();
		Car.staticMethod();
		System.out.println(c.speed);
		
		
		
		
		System.out.println("**************");

		Car c1 = new BMW();
		c1.Start();
		System.out.println(c1.speed);
		
	} 

}
