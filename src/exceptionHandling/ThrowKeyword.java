package exceptionHandling;

public class ThrowKeyword {

	
	
	
	
	public static void main(String[] args) {
		String data =null;
		
		if(data ==null) {
			
			try {
				
				throw new Exception("Data not found");
				
				}
				catch(Exception e){
					
					System.out.println("Data Exception ------catch");
					e.printStackTrace();
				}
	
		}
		
		System.out.println("logout");
	}

}
