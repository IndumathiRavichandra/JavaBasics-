package javasessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		//1. Post Increment
		int a = 1;
		int b = a++;
		System.out.println(a); //2 add 1 to a value
		System.out.println(b); //1 value of a 
		
		int g = -98;
		int h = g++; // h = -98; g = -97
		System.out.println(g); // add 1 to g value
		System.out.println(h); // value of g
		
		//2. PreIncrement
		int c = 1;
		int d = ++c;
		System.out.println(c); // add 1 to c value
		System.out.println(d); // add 1 to c value and pass to d  
		
		
		int t = -99;
		int p = ++t; // t = -98; g = -98
		System.out.println(t); //add 1 to t 
		System.out.println(p); //add 1 to t value and pass to p  
		
		
		//3. Post Decrement
		int k = 2;
		int m= k--;
		System.out.println(k);//2-1 - minus 1 to k value
		System.out.println(m); //2 - k value to m

		//3. PreDecrement
				int e = 2;
				int f= --e;
				System.out.println(e);//2-1 - minus 1 to e value
				System.out.println(f); //1 - e value to f
				
				
				
		int u = 2;
		System.out.println(u++); // u = 2
		System.out.println(u); // u = 2+1
		
		
		int w = 2;
		System.out.println(++w); // w = 3
		System.out.println(w); // w = 2+1
		
		System.out.println("*****************");
		
		int x = 2;
		int y = x++;
		System.out.println(x);
		System.out.println(y); 
		
		int n = 2;
		int o = n--;
		System.out.println(n);
		System.out.println(o); 
		
		int q = 2;
		int r = ++q;
		System.out.println(q);
		System.out.println(r);
		
		int i = 2;
		int j = --i;
		System.out.println(i);
		System.out.println(j);
		
	}

}
