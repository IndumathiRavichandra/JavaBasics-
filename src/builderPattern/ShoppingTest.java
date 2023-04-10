package builderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcommApplication obj = new EcommApplication();
		obj.login("indu@gmail.com", "indu123")
		.search("imac")
		.addToCart("imac")
		.payment("2454sc", 45460)
		.getOrderId()
		.logOut();
		
		
		
	}
	

}
