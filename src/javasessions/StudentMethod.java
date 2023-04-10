package javasessions;

public class StudentMethod { 
	
	// this method is time consuming its goes through each and every functions and finally gives the output.

	
		public int getStudentMarks(String sname) {
			
			

			System.out.println("getting student marks");
			
			int marks = -1;
			
			

			if (sname.equals("Indu")) {

				marks = -1;

			} else if (sname.equals("Tanshu")) {

				marks = 95;;

			}

			else {

				System.out.println("Student not found");
				marks = 100;
			}
			
			return marks;

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


