package assignmntApril15;
import java.util.Scanner;
public class PhoneBuy {
	Scanner sc = new Scanner(System.in);
	
	
	String phoneBrand, phoneModel, phonePlan;
	int price;
	void readPhone() {
		System.out.println("Please enter the Brand that you want to choose from: Apple/Samsung");
		phoneBrand=sc.next();
		
	}
	
	
	
	void pricePhone() {
		if(phoneBrand.equals("Samsung")) {
			System.out.println("Please enter the model that you want to buy from below");
			System.out.println(" S22 \n S22+\n S22 Ultra \n S22FE");
			sc.nextLine();
			phoneModel=sc.nextLine();
			switch (phoneModel) {
			case "S22":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected S22 with Rogers plan.\nYour Phone Tab will be     :$25");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$95");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected S22 with Bell plan.\nYour Phone Tab will be     :$25");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$105");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected S22 with Telus plan.\nYour Phone Tab will be     :$25");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$100");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
			case "S22+":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected S22+ with Rogers plan.\nYour Phone Tab will be     :$35");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$105");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected S22+ with Bell plan.\nYour Phone Tab will be     :$35");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$115");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected S22+ with Telus plan.\nYour Phone Tab will be     :$35");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$105");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
			case "S22 Ultra":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected S22 Ultra with Rogers plan.\nYour Phone Tab will be     :$55");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$125");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected S22 Ultra with Bell plan.\nYour Phone Tab will be     :$55");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$135");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected S22 Ultra with Telus plan.\nYour Phone Tab will be     :$55");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$130");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
			case "S22FE":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected S22FE with Rogers plan.\nYour Phone Tab will be     :$20");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$90");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected S22FE with Bell plan.\nYour Phone Tab will be     :$20");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$100");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected S22FE with Telus plan.\nYour Phone Tab will be     :$20");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$95");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
				default:
					System.out.println("Select model from the given list");
			}
		}else if(phoneBrand.equals("Apple")) {
			System.out.println("Please enter the model that you want to buy from below");
			System.out.println(" IPhone 14 \n Iphone 14 Pro\n IPhone 14 Pro Max \n IPhone 14 Mini");
			sc.nextLine();
			phoneModel=sc.nextLine();
			switch (phoneModel) {
			case "IPhone 14":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected IPhone 14 with Rogers plan.\nYour Phone Tab will be     :$30");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$100");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected IPhone 14 with Bell plan.\nYour Phone Tab will be     :$30");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$110");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected IPhone 14 with Telus plan.\nYour Phone Tab will be     :$30");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$105");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
			case "IPhone 14 Pro":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected Iphone 14 Pro with Rogers plan.\nYour Phone Tab will be     :$40");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$110");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected Iphone 14 Pro with Bell plan.\nYour Phone Tab will be     :$40");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$120");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected Iphone 14 Pro with Telus plan.\nYour Phone Tab will be     :$40");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$115");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
			case "IPhone 14 Pro Max":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected IPhone 14 Pro Max with Rogers plan.\nYour Phone Tab will be     :$65");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$135");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected IPhone 14 Pro Max with Bell plan.\nYour Phone Tab will be     :$65");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$145");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected IPhone 14 Pro Max with Telus plan.\nYour Phone Tab will be     :$65");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$140");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
			case "IPhone 14 Mini":
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell ");
				phonePlan=sc.next();
				if(phonePlan.equals("Rogers")) {
					System.out.println("You have selected IPhone 14 Mini with Rogers plan.\nYour Phone Tab will be     :$25");
					System.out.println("Your Monthly Plan will be     :$70");
					System.out.println("Total amount     :$95");
				}else if(phonePlan.equals("Bell")) {
					System.out.println("You have selected IPhone 14 Mini with Bell plan.\nYour Phone Tab will be     :$25");
					System.out.println("Your Monthly Plan will be     :$80");
					System.out.println("Total amount     :$105");
				}else if(phonePlan.equals("Telus")) {
					System.out.println("You have selected IPhone 14 Mini with Telus plan.\nYour Phone Tab will be     :$25");
					System.out.println("Your Monthly Plan will be     :$75");
					System.out.println("Total amount     :$100");
				}else {
					System.out.println("Select from the given service providers");
				}
				break;
				
				default:
					System.out.println("Select model from the given list");
			}
		}else {
			System.out.println("Enter Appple or Samsung");
		}
	}

}
