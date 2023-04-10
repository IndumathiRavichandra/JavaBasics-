package builderPattern;

public class Browser {

	String name;
	double version;

	public void getBrowser(Browser br1) {
		
		br1.name = "ff";
		br1.version = 109;
		System.out.println(br1.name+  " " + br1.version);
	}

	public static void main(String[] args) {
	
		Browser br = new Browser();
		br.name = "chrome";
		br.version = 104.4;
		System.out.println(br.name +  " " +br.version);
		
		br.getBrowser(br); ////passing by reference instead of value
		
		System.out.println(br.name+  " " + br.version);

	}

}
