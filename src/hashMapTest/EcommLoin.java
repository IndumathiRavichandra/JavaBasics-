package hashMapTest;

import java.util.HashMap;
import java.util.Map;

//user role : seller,admin, partner,customer, vendor,catmanager

public class EcommLoin {

	public static String getUserCredent(String role) {
		Map<String, String> roleMap = new HashMap<String, String>();
		roleMap.put("seller", "seller@gmail.com|seller123");
		roleMap.put("admin", "admin@gmail.com|admin123");
		roleMap.put("partner", "partner@gmail.com|partner123");

		roleMap.put("customer", "customer@gmail.com|customer123");

		return roleMap.get(role);

	}

	
	public static String getUserName(String role) {

		String creds = getUserCredent(role); // seller@gmail.com|seller123
		//System.out.println(creds);
		return creds.split("\\|")[0];
		
		
	}//seller@gmail.com
		

	
	public static String getPassword(String role) {

		String creds = getUserCredent(role); // seller@gmail.com|seller123
		return creds.split("\\|")[1]; //seller123

	}

	
	public static void main(String[] args) {
		String un = getUserName("seller");
		String pwd = getPassword("seller");
		System.out.println(un + ": " + pwd);
		

	}

}
