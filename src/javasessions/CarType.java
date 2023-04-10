package javasessions;

public class CarType {
	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void main(String[] args) {
		
		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 1000;
		c1.color = "blue";
		//c1.wheels = 4;
		
		
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 5000;
		c2.color = "red";
		//c2.wheels = 4;
		
		
		CarType c3 = new CarType();
		c3.name = "honda";
		c3.price = 5000;
		c3.color = "white";
		//c3.wheels = 4;
		
		//System.out.println(c1.wheels);
		System.out.println(CarType.wheels); // call static property by class Name.
		//System.out.println(wheels);
		System.out.println(c1.name + " " + c1.color + " " + c1.price +" " +  CarType.wheels);
		
		
		final int days = 7;
		//days = 10;
		System.out.println(days * 10);
				
	}

} 
