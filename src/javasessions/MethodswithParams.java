package javasessions;

public class MethodswithParams {

	public boolean IsActive() {
		System.out.println("user is active");
		return false;
	}

	public void Click() {

		System.out.println("click on element");
	}

	public void sendKeys(String value) {
		System.out.println("Enter the values " + value);
	}

	public static void Add(int a, int b) {

		int c = a + b;

		System.out.println("2 int param eg is " + c);
	}

	public static int AddwithoutVoid(int a, int b) {

		int c = a + b;
		return c;

	}

	public static void simpleParams(String value) {

		System.out.println("Single params eg is " + value);
	}

	public static void main(String[] args) {

		simpleParams("Indu");
		Add(200, 10);
		int Sum = AddwithoutVoid(310, 10);
		System.out.println(Sum);

		MethodswithParams mwp = new MethodswithParams();
		if (mwp.IsActive()) {
			System.out.println("credit the salary");

		}

		else {
			System.out.println("do not credit");
		}

		mwp.Click();
		mwp.sendKeys("Aradhya");

	}

}
