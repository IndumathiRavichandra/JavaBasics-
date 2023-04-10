package javasessions;

public class Browser {

	/*
	 * public void launchBrowser(String browserName) {
	 * 
	 * System.out.println("launch browser " + browserName); switch (browserName) {
	 * case "chrome": System.out.println("chrome"); break;
	 * 
	 * case "FF": System.out.println("FF"); break;
	 * 
	 * case "IE": System.out.println("IE"); break;
	 * 
	 * case "ME": System.out.println("ME"); break;
	 * 
	 * default: System.out.println("pls pass right browser + " + browserName);
	 * break; } }
	 */

	public boolean launchBrowser(String browserName) {

		System.out.println("launch browser " + browserName);
		boolean flag = false;

		switch (browserName.toLowerCase().trim()) {
 		case "chrome":
			System.out.println("chrome");
			flag = true;
			break;

		case "FF":
			System.out.println("FF");
			flag = true;
			break;

		case "IE":
			System.out.println("IE");
			flag = true;
			break;

		case "ME":
			System.out.println("ME");
			flag = true;
			break;

		default:
			System.out.println("pls pass right browser + " + browserName);
			break;
		}
		return flag;
	}

	public static void main(String[] args) {

		Browser br = new Browser();
		boolean b = br.launchBrowser("chrome");
		System.out.println(b);
		
		System.out.println("************************************************");
		
		boolean b1 = br.launchBrowser("Safari");
		System.out.println(b1);
		
System.out.println("************************************************");
		
		boolean b2 = br.launchBrowser("         Chrome");
		System.out.println(b2);
	}

}
