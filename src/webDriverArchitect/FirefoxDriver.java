package webDriverArchitect;

public class FirefoxDriver implements Webdriver {

	//constructor
	
	public FirefoxDriver() {
		System.out.println("lauch FirefoxDriver browser");
	}
	
	@Override
	public void findElement() {
		System.out.println("fin element");

	}

	@Override
	public void findElements() {
		System.out.println("fin elements");

	}

	@Override
	public void get(String url) {
		System.out.println("launch url " + url);

	}

	@Override
	public void click(String element) {
		System.out.println("click on element  " + element);

	}

	@Override
	public void sendkeys(String element, String value) {
		System.out.println("Enter value in element " + element + " " + value);

	}

	@Override
	public String getText(String ele) {
		System.out.println("getText " + ele);
		String str = "Amazon Header";
		return str;

	}

	@Override
	public boolean isDisplayed(String ele) {
		System.out.println("element is isDisplayed " + ele);
		return true;

	}

	@Override
	public void Quit() {
		System.out.println("close browser");

	}
	public static void main(String[] args) {

	}


}
