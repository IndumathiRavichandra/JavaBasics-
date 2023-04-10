package oop_Interface;

//is a relationship
public class FortisHospital extends Medical implements USMedical,UkMedical  {

	
	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");
		 
	}

	@Override
	public void neuroServices() {
		System.out.println("FH---neuroServices");

		
	}
	
	@Override
	public void ENTServices() {
		System.out.println("FH ---uk---ENTServices");

		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH----uk---ENTServices");

		
	}
	
public static void tocheckStatic() {
		
		System.out.println("testing static");
	}
	

	// individual
	public void medicalTraining() {
		System.out.println("FH---medicalTraining");
		
	}
	
	public void medicalBills() {
	
		System.out.println("FH---medicalBills");
	}

	@Override
	public void NewInterfaceCheck() {
		System.out.println("new interface inherited through another interface using extend");
		
	}

	public static void main(String[] args) {
		
		
	}

	
	

	

}
 