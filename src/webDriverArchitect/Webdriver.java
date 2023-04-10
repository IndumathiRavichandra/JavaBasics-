package webDriverArchitect;

public interface Webdriver extends SearchContext { // interface to interface extend keyword

	@Override
	public void findElement();

	@Override
	public void findElements();

	public void get(String url);
	
	public void click(String element);

	public void sendkeys(String element, String value);
	
	public String getText(String ele);

	public boolean isDisplayed(String ele);
	
	public void Quit();
	
}
