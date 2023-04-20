
//Not completed
package assignmntApril15PhoneBuyReDo;
import java.util.Scanner;
public class BuyPhone {
	int i=0,j=0;
	Scanner sc = new Scanner(System.in);
	String[]samsungModel= {"S22", "S22+","S22 Ultra", "S22FE"};
	int[] samsungModelPrice = {25,35,55,20};
	int[] appleModelPrice = {30,40,65,25};
	

	String[]appleModel= {"IPhone 14", "Iphone 14 Pro", "IPhone 14 Pro Max", "IPhone 14 Mini"};
	
	int checkPhoneBrand(String phoneBrand) {
		for(i=0;i<3;i++) {
			
			if(phoneBrand.equals("Samsung")||phoneBrand.equals("Apple")) {
				
				break;
			}else {
				System.out.println("Enter Apple or Samsung");
				phoneBrand = sc.next();			
				}
		}
		
		if(i==3) {
			return 0;
		}else {
			return 1;
		}
	}
	
	
	String findPhoneModel(String phoneBrand) {
		int i=0;
		String phoneModel="";
		if (phoneBrand.equals("Samsung")) {
			System.out.println("Enter the model that you want to buy from below ");
			for(i=0;i<samsungModel.length;i++) {
				System.out.println(samsungModel[i]);
			}
		}else {
			System.out.println("Enter the model that you want to buy from below ");
			for(i=0;i<appleModel.length;i++) {
				System.out.println(appleModel[i]);
			}
		}
		//sc.nextLine();
		
		phoneModel=sc.nextLine();
		
			
		
		
		return phoneModel;
	}
	
	int findPricOfModel(String phoneModel, String phoneBrand) {
		
		int phonePrice=0;
		if (phoneBrand.equals("Samsung")) {
			for(int i=0;i<samsungModel.length;i++) {
				if(samsungModel[i].equals(phoneModel)) {
					phonePrice=samsungModelPrice[i];
				}
			}
		}else if (phoneBrand.equals("Apple")) {
			for(int i=0;i<appleModel.length;i++) {
				if(appleModel[i].equals(phoneModel)) {
					phonePrice=appleModelPrice[i];
					break;	
				}
				
			}
			
			
		}
		return phonePrice;
	}
	
	
		
	

	
	
	

}
