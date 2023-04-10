package webDriverArchitect;

public class AmazonTest {

	static Webdriver driver;
	
	public static void main(String[] args) {
		
	
		
		String browser = "safari";
		//String browser = "ie"; ////////null pointer exception
		
		
		
		if(browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			}
		
		
		driver.findElement();
		driver.findElements();
		driver.get("www.google.com");
		driver.click("login");
		driver.sendkeys("email id", "indu.gmail.com");
		driver.sendkeys("password", "pwdcom");
		driver.getText("login success");
		driver.isDisplayed("true");
		driver.Quit();
	}

}
