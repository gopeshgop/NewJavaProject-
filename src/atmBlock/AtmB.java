package atmBlock;
import java.util.Scanner;
public class AtmB {
	Scanner sc = new Scanner(System.in);
	int atmPin=8521, balanceAmount=10000, amountEnter;
	void checkAtmPin() {
		for(int i=0;i<=2;i++) {
			System.out.println("Enter the PIN");
			
			if(atmPin==sc.nextInt()) {
				System.out.println("Enter the amount");
				amountEnter=sc.nextInt();
				
				if(amountEnter>balanceAmount) {
					do {
						System.out.println("You dont have enough balance");
						System.out.println("Please Enter lesser amount");
						amountEnter=sc.nextInt();
						}while(amountEnter>balanceAmount);
					
					balanceAmount-=amountEnter;
					System.out.println(amountEnter+" is withdrawn and balance is "+balanceAmount);
				}else {
					balanceAmount-=amountEnter;
					System.out.println(amountEnter+" is withdrawn and balance is "+balanceAmount);
				}break;	
			}else {
				
				if(i==2) {
				System.out.println("Wrong PIN and your card is blocked");
				}else {
					System.out.println("Wrong PIN");
				}
			}
				
		}
		
	}

}
