package assignmentMarch31;
import java.util.Scanner;

public class Calculator {
int num;
String option;
Scanner sc = new Scanner(System.in);

void calculator() {
	System.out.println("Enter a number");
	num=sc.nextInt();
	System.out.println("Enter an option to process[Cube, Square]");
	option = sc.next();
	switch(option) {
	case "Cube":
		System.out.println("The cube of "+num +"is "+num*num*num);
		break;
	case "Square":
		System.out.println("The square of  "+num +"is "+num*num);
		break;
	default:
		System.out.println("Wrong option entered");
		
	}
	
}

}
