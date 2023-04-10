package javasessions;

public class ArithConcept {

	public static void main(String[] args) {
	
		
		int i = 9;
		int j = 3;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);

		
		System.out.println(9/3);
		//System.out.println(9/0); // Arithmetic Exception
		System.out.println(9.0/0);//***************Output is Infinity************* Not Exception
		System.out.println(0/9);
		System.out.println(0/900);
		System.out.println(9/2); // since 9 and 2 are integers output will be 4
		System.out.println(9.0/2); // since 9 is floating number output will be 4.5
		System.out.println(9.0/2.0); // since 9 and 2 are is floating number output will be 4.5
		System.out.println(-9-2);
		//System.out.println(0/0); // Arithmetic Exception
		System.out.println(9/0.0); //Infinity
		System.out.println(0/0.0); //NaN
		System.out.println(0.0/0.0); //NaN
		//System.out.println(0/0); //AE
		
		System.out.println("Moldules");
		System.out.println(9 % 3);
		System.out.println(9 % 2);
	}

}
