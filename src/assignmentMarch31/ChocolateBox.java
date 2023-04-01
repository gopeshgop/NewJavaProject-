package assignmentMarch31;
import java.util.Scanner;

public class ChocolateBox {
	int totalStock=27, add;
	Scanner sc = new Scanner(System.in);
	
	void addToBox() {
		do {
			System.out.println("Hey you can add more chocolates to the box");
			add=sc.nextInt();
			if(add==5) {
				totalStock+=add;
				
			}else {
				System.out.println("You can only add a set of 5 chocolates");
			}
			
		}while(totalStock<62);
		System.out.println("You cannot add more. The box has reached its limit");
		
	}

}
