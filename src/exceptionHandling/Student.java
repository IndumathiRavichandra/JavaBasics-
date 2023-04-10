package exceptionHandling;

public class Student {

	public static int getMarks(String name) {

		System.out.println("marks for : " + name);

		if (name.equals("Indu")) {

			try {

				int i = 9 / 3;
				return 100;

			} catch (Exception e) {

				return 65;
			}

			finally {

				System.out.println("finally");
			return 75;
			}
		
			// return 90;

		} else if (name.equals("Anu")) {

			return 95;

		} else if (name.equals("asfadf")) {

			return 80;

		} else {

			System.out.println("not found");
			return -1;
		}

	}

	public static void main(String[] args) {

		int no = getMarks("Indu");
		System.out.println(no);
	}

}
