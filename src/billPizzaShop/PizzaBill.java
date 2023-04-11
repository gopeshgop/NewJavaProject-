package billPizzaShop;
import java.util.Scanner;

public class PizzaBill {
	
	int pizzaOption, cheeseOption;
	int pepOption, finalBill;
	Scanner sc = new Scanner(System.in);
	
void billPizza() {
	System.out.println("Enter one of the following option from the list");
	System.out.println("1-Small Pizza, 2-Medium Piza, 3-Large Pizza");
	pizzaOption = sc.nextInt();
	
	System.out.println("Press 1 if you want extra cheese or 0 to proceed with out cheese");
	cheeseOption = sc.nextInt();
	
	System.out.println("Press 2 if you want extra pepperoni or 0 proceed without extra pepperoni");
	pepOption = sc.nextInt();
	
	
	switch(pizzaOption) {
	case 1: if(pepOption==2) {
		finalBill = 15+pepOption+cheeseOption;
		System.out.println("The final bill for your Piza is $"+finalBill);
	}else {
		finalBill = 15+cheeseOption;
		System.out.println("The final bill for your Piza is $"+finalBill);
	}
	break;
	case 2: if(pepOption==2) {
		pepOption++;
		finalBill = 20+pepOption+cheeseOption;
		System.out.println("The final bill for your Piza is $"+finalBill);
	}else {
		finalBill = 20+cheeseOption;
		System.out.println("The final bill for your Piza is $"+finalBill);
	}
	break;
	case 3: if(pepOption==2) {
		pepOption++;
		finalBill = 25+pepOption+cheeseOption;
		System.out.println("The final bill for your Piza is $"+finalBill);
	}else {
		finalBill = 25+cheeseOption;
		System.out.println("The final bill for your Piza is $"+finalBill);
	}
	break;
	
	default:System.out.println("Wrong option");
	break;
	}
	
	
}

}


