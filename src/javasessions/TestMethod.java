package javasessions;

public class TestMethod {

	public static void test() {
		int a = 10 + 20 + 30;
		System.out.println(a);
	}

	public void test1() {

		System.out.println("test1");
	}

	public int Math() {
		System.out.println("no void");
		int a = 100;
		int b = 20;
		int sum = a + b;
		return sum;

	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Anu";
		return name;

	}

	public void getBill() {
		System.out.println("get bill");
		int foodbill = 100;
		double drinks = 25.65;
		int dessert = 30;
		double totalAmount = foodbill + drinks + dessert;
		System.out.println(totalAmount);

	}
	
	public double getBill2() {
		System.out.println("get bill2");
		int foodbill = 500;
		double drinks = 25.65;
		int dessert = 30;
		double totalAmount = foodbill + drinks+ dessert;
		System.out.println(totalAmount);
		return totalAmount;
		
	}

	public static void main(String[] args) {

		test();

		TestMethod tsm = new TestMethod();
		tsm.test1();
		int Sum = tsm.Math();
		System.out.println(Sum);
		System.out.println(Sum - 1);
		//tsm.Math();
		System.out.println(tsm.Math());

		String n = tsm.getTrainerName();
		System.out.println(tsm.getTrainerName());
		System.out.println(n);
		if (n.equals("Indu")) {

			System.out.println("pass");
		} else {
			System.out.println("different");
		}

		tsm.getBill();
		tsm.getBill2();
		double TAmt = tsm.getBill2();
		System.out.println(TAmt);
	}

}
