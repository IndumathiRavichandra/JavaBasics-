package javasessions;

import java.util.Arrays;

public class Company {

	// AC
	// WAF- Write a function
	// getEmployeeDevices
	// input param: employeeName(String)
	// return: all the devices --- Array--- device name String

	public String[] getEmployeeDevices(String empName) {
		System.out.println(" EmployeeDevices for Employee " + empName);

		String devices[] = new String[5];

		if (empName.equals("Indu")) {

			devices[0] = "mouse";
			devices[1] = "mac book";
			devices[2] = "keypad";
			devices[3] = "headset";
			devices[4] = "key board";

		} else if (empName.equals("gooj")) {

			devices[0] = "hb";
			devices[1] = "notepad";
			devices[2] = "tablet";
		}

		else if (empName.equals("tanshu")) {

			devices[0] = "dell";
			devices[1] = "tab";
			devices[2] = "paint";
		} else {
			System.out.println("not found the employee" + empName);
		}
		return devices;

	}

	public static void main(String[] args) {

		Company c = new Company();
		c.getEmployeeDevices("tanshu");
		String[] dv1 = c.getEmployeeDevices("tanshu");
		System.out.println(" EmployeeDevices in total : " + dv1.length);
		System.out.println(Arrays.toString(dv1));
		
		//for ( String k : devices) {
		//	System.out.println(k);
		//}
	}

}
