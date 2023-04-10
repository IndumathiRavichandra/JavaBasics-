package javasessions;

public class Student {
	
	// this method is preferred as its goes through functions and comes out from the loop conditions once the condition satisfies..

	public int getStudentMarks(String sname) {

		System.out.println("getting student marks");

		if (sname.equals("Indu")) {

			return 90;

		} else if (sname.equals("Tanshu")) {

			return 95;

		}

		else {

			System.out.println("Student not found");
			return -1;
		}

	}

	public static void main(String[] args) {

		Student s = new Student();
		int n = s.getStudentMarks("Indu");
		System.out.println(n);
		System.out.println(n - 5);

		int k = s.getStudentMarks("lll");
		System.out.println(k);
		if (k == -1) {

			System.out.println("no need to print mark sheet");
		}

	}

}
