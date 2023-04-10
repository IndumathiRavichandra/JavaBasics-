package exceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {


		String browser = "opera";
		if(browser.equals("chrome")){
			
		System.out.println("chrome");	
		}
	
		else if (browser.equals("ff")){
				
				System.out.println("ff");	
				}
		else if (browser.equals("safari")){
			
			System.out.println("safari");	
			}
		else {
			
			System.out.println("pls pass right browser");
			throw new MyException(" no browser exception");
		}
		
		}

	}


