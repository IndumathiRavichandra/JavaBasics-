package javasessions;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		
		//String browser = "opera";
		String browser = "chrome";
		//String browser = "ie";
		if (browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if(browser.equals("edge")) {
			System.out.println("launch edge");
			
		}
		if(browser.equals("ie")) {
			System.out.println("launch ie");// since this fail ---executes else
		}
		else 
		{
			System.out.println(" please pass the right browser ..." + browser);
		}
		
		
		System.out.println("**********");
		String bbrowser = "chrome";
		//String browser = "ie";
		if (bbrowser.equals("chrome")){
			System.out.println("launch chrome");
		}
		
		else if(bbrowser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(bbrowser.equals("edge")) {
			System.out.println("launch edge");
			
		}
		else if(bbrowser.equals("ie")) {
			System.out.println("launch ie");// since this fail ---executes else
		}
		else 
		{
			System.out.println(" please pass the right browser ..." + browser);
		}
	}

}
