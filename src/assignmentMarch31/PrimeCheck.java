package assignmentMarch31;
import java.util.Scanner;

public class PrimeCheck {
	int num, prime;
	Scanner sc = new Scanner(System.in);
	
	void primeNumberCheck() {
		System.out.println("Enter a positive number ");
		num=sc.nextInt();
		//System.out.println(num);
		if(num==1) {
			System.out.println(num+" is a prime number");
		}else if(num==2) {
			System.out.println(num+" is not a prime number");
		}else {
			for(int i=2;i<num;i++) {
				prime=num%i;
				if(prime==0) {
					System.out.println(num+" is not a Prime number");
					break;
				}else {
					prime=1;
				}
				
			}
		}
		
		if(prime==1) {
			System.out.println(num+" is a Prime Number");
		}
	}

}
