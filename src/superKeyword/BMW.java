package superKeyword;

public class BMW extends Car {

	public BMW() {
		super(10);
		System.out.println("BMW constructor");
	}
	
	int maxSpeed = 7800;

	@Override
	public void racing() {

		System.out.println("BMW--------- racing");

	}

	public static void refuel() {

		System.out.println("BMW--------- refuel");

	}

	public void info() {

		int carSpeed = super.maxSpeed;

		System.out.println(carSpeed);
		System.out.println(maxSpeed);
		System.out.println(price);

		super.racing();
		racing();
		refuel();
		super.refuel();
	}

	public static void main(String[] args) {
		BMW b = new BMW();
		b.info(); // pointing child class
	}

}
