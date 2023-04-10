package javasessions;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i<=9; i++) {
			

			for (int j= 0; j<=9; j++) {
				
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************************"); 
for (int i = 0; i<=9; i++) {
			

			for (int j= 0; j<=9; j++) {
				
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
		 
}
}