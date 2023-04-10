package javasessions;


public class Assignment03 {

	int r;
	
	public Assignment03(int r) {
		this.r = r;
		
	}
	
	public float Area() {
		
		float pie = 3.14f;
		float ar = r * pie;
		return ar;
	}

	public static void main(String[] args) {
		Assignment03 ass3 = new Assignment03(4);
		float result =  ass3.Area();
		System.out.println(result);
		
		
		
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	    
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	
	
 }

}
	


