package march24;

public class LissAssign {
	int age;
	String currentLicence;
	void issueLicence() {
	if (age>=16) {
		if(currentLicence=="G1") {
			System.out.println("Eligible to issue G2");
		}
		else if(currentLicence=="G2") {
			System.out.println("Eligble to issue G");
		}
		else if(currentLicence=="G"){
			System.out.println("You have G licence ");
		}
		else {
			System.out.println("appply for G1");
		}
	}else {
		System.out.println("You should be atleast 16 years");
	}
	}

}
