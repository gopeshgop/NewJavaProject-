package assignmntAprilSix;
import java.util.Scanner;
import java.util.Arrays;

public class PhoneProductList {
	
	
	String[]phoneList1= {"Samsung","S20","S21","Flip3","Fold 3"};
	String[]phoneList2= {"Google","Google Pixle 6","Google Pixle 6 Pro","Google Pixle 5"};
	String[]phoneList3= {"Apple","Iphone 12","Iphone 12 mini","Iphone 11","Iphone 11 pro"};
	String readPhone, readProduct;
	boolean check;
	Scanner sc = new Scanner(System.in);
	void phoneListDisplay() {
		
		System.out.println("Enter a Phone brand name from the list Samsung, Google, Apple");
		readPhone=sc.next();
		
		
		if(readPhone.equals("Samsung")) {
			for(int i=0;i<phoneList1.length;i++) {
				System.out.println(phoneList1[i]);
			}
			System.out.println("Please enter a product name");
			sc.nextLine();
			readProduct=sc.nextLine();
			for(int i=0;i<phoneList1.length;i++) {
				if(phoneList1[i].equals(readProduct)) {
					check=true;
				}
			}
			if(check) {
				System.out.println("Product selected is "+readProduct);
			}else {
				System.out.println("Please select from the list");
			}
			
		}else if(readPhone.equals("Google")) {
			for(int i=0;i<phoneList2.length;i++) {
				System.out.println(phoneList2[i]);
			}
			System.out.println("Please enter a product name");
			sc.nextLine();
			readProduct=sc.nextLine();
			for(int i=0;i<phoneList2.length;i++) {
				if(phoneList2[i].equals(readProduct)) {
					check=true;
				}
			}
			if(check) {
				System.out.println("Product selected is "+readProduct);
			}else {
				System.out.println("Please select from the list");
			}
		}else if(readPhone.equals("Apple")) {
			for(int i=0;i<phoneList3.length;i++) {
				System.out.println(phoneList3[i]);
			}
			System.out.println("Please enter a product name");
			sc.nextLine();
			readProduct=sc.nextLine();
			for(int i=0;i<phoneList3.length;i++) {
				if(phoneList3[i].equals(readProduct)) {
					check=true;
				}
			}
			if(check) {
				System.out.println("Product selected is "+readProduct);
			}else {
				System.out.println("Please select from the list");
			}
		
	}else {
		System.out.println("Wrong produuct");
	}
	
		
		

}
}
