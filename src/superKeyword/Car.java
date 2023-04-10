package superKeyword;

public class Car extends Vehicle{


	public Car() {
		System.out.println("Car constructor");
	}

	public Car(int i) {
		System.out.println("Car constructor + --" + i);
	}

	
//int maxSpeed = 100;
int price = 200;
	
	public void info() {
		
		System.out.println("Car racing");
		
	}
	
public void racing() {
		
		System.out.println("Car--------- racing");
		
	}


	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		Car c = new Car();
		c.info();
		c.racing();
		*/
	}

}
