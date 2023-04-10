package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fhs = new FortisHospital();
		fhs.physioServices();
		fhs.cardioServices();
		fhs.neuroServices();
		fhs.ENTServices();
		fhs.pediaServices(); 
		fhs.NewsClass();
		fhs.NewInterfaceCheck();
		FortisHospital.tocheckStatic();

		
		
		//USMedical usm = new USMedical; cannot create since its an Interface --only class can create
		
	}

}
