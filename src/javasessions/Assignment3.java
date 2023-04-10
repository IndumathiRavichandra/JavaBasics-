package javasessions;

public class Assignment3 {
	
	int n1;
	int n2;
	

	public static void AddNumbers(int a, int b) {
		
		 int c = a+b;
		 System.out.println(c);
	}
	
	
	public int AddNumbersWithReturn(int a, int b) {
		
		 int c = a+b;
		 return c;
		 }
	
	public Assignment3(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
		
		
		
	}
	
	public int Multiply(int n1, int n2) {
		
		 int d = n1 * n2;
		 return d;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Assignment3.AddNumbers(10, 50);
		
		Assignment3 ass1 = new Assignment3(10,1);
		System.out.println(ass1.n1 + ass1.n2);
		
		
		int c = ass1.Multiply(80, 80);
		System.out.println(c);
		
		
		
		
	}

}
