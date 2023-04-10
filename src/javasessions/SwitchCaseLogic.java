package javasessions;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		String browser = "ChRome";

		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");

			String version = "105";
			switch (version) {
			case "105":
				System.out.println("launch chrome with 105 version");

				break;

			default:
				break;
			}

			break;

		case "firefox":
			System.out.println("launch firefox");
			break;

		case "ie":
			System.out.println("launch ie");
			break;

		case "edge":
			System.out.println("launch edge");
			break;

		default:
			System.out.println(" please pass the right browser ..." + browser);
			break;

		case "brave":
			System.out.println("launch brave");
			break;

		}
		byte a = 90;
		switch (a) {
		case 90:
			
			break;

		default:
			break;
		}
	}
}
