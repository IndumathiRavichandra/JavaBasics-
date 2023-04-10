package javasessions;

public class SwitchHomework {

	public void getTemperature(String country) {

//int temp;

		System.out.println("Country name " + country);

		switch (country.toLowerCase()) {

		case "India":
			System.out.println("temp 1");

		case "Usa":
			//temp = 50;

		case "Ireland":
			//temp = 100;

		case "britain":
			//temp = 100;

			break;
		default:
			System.out.println("Country name not found " + country);
			break;

		}

	}

	public static void main(String[] args) {

		SwitchHomework temper = new SwitchHomework();
		temper.getTemperature("India");
		

	}
}
