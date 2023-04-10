package javasessions;

public class Car {

	
	String name;
	String color;
	double price;
	String type;
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "bmw";
		c1.color = "white";
		c1.price = 75.55;
		c1.type = "Sedan";
		
		Car c2 = new Car();
		c2.name = "mini cooper";
		c2.color = "ble";
		c2.price = 100.55;
		c2.type = "small";
		
		Car c3 = new Car();
		c3.name = "audi";
		c3.color = "red";
		c3.price = 1000.55;
		c3.type = "small";
		
		
		System.out.println("c1 = "+ c1.name+ " " + c1.color+ " " +c1.price+ " " +c1.type);
		System.out.println("c2 = "+ c2.name+ " " + c2.color+ " " +c2.price+ " " +c2.type);
		System.out.println("c3 = "+ c3.name);
		
		System.out.println("******************c1=c2*********");
		c1=c2;
		
		System.out.println("c1 = "+ c1.name);
		System.out.println("c2 = "+ c2.name);
		System.out.println("c3 = "+ c3.name);
		
		
		System.out.println("******************c2=c3*********");
		c2=c3;
		
		System.out.println("c1 = "+ c1.name);
		System.out.println("c2 = "+ c2.name);
		System.out.println("c3 = "+ c3.name);
		
		
		
		System.out.println("******************c3=c1*********");
		c3=c1;
		
		System.out.println("c1 = "+ c1.name);
		System.out.println("c2 = "+ c2.name);
		System.out.println("c3 = "+ c3.name);
		
		
		System.out.println("******************c1=c2*********");
		c1=c2;
		
		System.out.println("c1 = "+ c1.name);
		System.out.println("c2 = "+ c2.name);
		System.out.println("c3 = "+ c3.name);
		
		
	}

}
