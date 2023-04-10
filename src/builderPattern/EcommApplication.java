package builderPattern;

public class EcommApplication {
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("login with " + un +" " + pwd);
		return this;
	}

	public EcommApplication search(String productName) {
		System.out.println("productName " + productName );
		return this;
	}
	
	
	public EcommApplication addToCart(String productName) {
		System.out.println("addToCart " + productName );
		return this;
	}
	
	public EcommApplication payment(String upi) {
		System.out.println("making payment " + upi );
		return this;
	}
	
	public EcommApplication payment(String upi, int cvv) { 
		System.out.println("making payment via cc " + cvv );
		return this;
	}
	
	public EcommApplication getOrderId() {
		System.out.println("getOrderId  " + 1234 );
		return this;
	}
	
	public EcommApplication logOut() {
		System.out.println("logout" );
		return this;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
