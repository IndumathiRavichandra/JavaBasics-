package javasessions;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		Object empData[] = new Object[5];
		empData[0] = "Indu";
		empData[1] = "25";
		empData[2] = "25.36";
		empData[3] = 'f';
		empData[4] = true;
		
		System.out.println(empData.length);
		System.out.println(Arrays.toString(empData));
		
		for(int k=0; k<=empData.length-1; k++) {
			System.out.println(empData[k]);
		}
		
		System.out.println("************************Using for each for the same");

		for(Object e : empData) {
			System.out.println(e);
		}
		
		System.out.println("************************Using OBJECT LITERALS");
		
		Object empinfo[] = {"Indu", 26,34.5,'m',true};
		System.out.println(empinfo.length);
		
		for(int k=0; k<=empinfo.length-1; k++) {
			System.out.println(empinfo[k]);
		}
		

	}

}
