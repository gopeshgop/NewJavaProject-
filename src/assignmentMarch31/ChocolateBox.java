package assignmentMarch31;
import java.util.Scanner;

public class ChocolateBox {
	int totalStock=27, add;
	Scanner sc = new Scanner(System.in);
	
	void addToBox() {
		while(totalStock<63) {
			if(totalStock+5<63) {
			System.out.println("Hey you can add more chocolates to the box");
			add=sc.nextInt();
			if(add==5) {
				totalStock+=add;
				
			}else {
				System.out.println("You can only add a set of 5 chocolates");
			}
		}else {
			System.out.println("You cannot add more. The box has reached its limit");
			break;
		}
			
		}
		//System.out.println("You cannot add more. The box has reached its limit");
		
	}

}
