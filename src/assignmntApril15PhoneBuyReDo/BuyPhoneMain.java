package assignmntApril15PhoneBuyReDo;
import java.util.Scanner;
public class BuyPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneBrand, phoneModel, phonePlan;
		int planPrice=0;
		BuyPhone buyPhone = new BuyPhone();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		phoneBrand = sc.next();
		
		int haltValue = buyPhone.checkPhoneBrand(phoneBrand);
		
		if (haltValue ==0) {
			System.out.println("You have entered wrong Brand more than four times");
			System.exit(0);
		}
		
		phoneModel = buyPhone.findPhoneModel(phoneBrand);
		int phonePrice = buyPhone.findPricOfModel(phoneModel, phoneBrand);
		System.out.println(phoneModel+phonePrice);
		System.out.println("Please select the plan you want to opt for: Rogers/ Telus/ Bell");
		phonePlan=sc.next();
		switch(phonePlan) {
		case "Rogers":
			
			planPrice=70;
			break;
		case "Telus":
			planPrice=75;
			break;
		case "Bell":
			planPrice=80;
			break;
			default:
				System.out.println("Please enter form the list");
		}
		
		System.out.println("You have selected " +phoneModel+"with"+phonePlan);
		System.out.println("Your Phone tab will be: "+phonePrice);
		System.out.println("Your Monthly plan will be : "+ planPrice);
		System.out.println("Total Monthly will be : "+(phonePrice+planPrice));
	}

}
