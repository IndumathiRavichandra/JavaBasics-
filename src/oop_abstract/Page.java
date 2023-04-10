package oop_abstract;

public abstract class Page {

	public abstract void title();
	public abstract void url();
	
	
	public void pagetimOut() {
		System.out.println("pagetimOut");
	}
	
	public final void displayLogo() { // dont want to override but still can give permission to the child class to override
		System.out.println("displayLogo");// logo will same in every page --- final keyword
	}
	
	public static void pageStyle() {
		System.out.println(" pageStyle ");
		getPagetheme(); // calling since its private
	}
	
	private static void getPagetheme() {
		System.out.println(" getPagetheme ");
	}
	
	public static void main(String[] args) {


	}

}
