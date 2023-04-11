package arithmaticOperations;

public class Operations {
	
		int num1, num2;int result;
		
		void quotient() {
			
			result = num1/num2;
			System.out.println("The quotient is " +result);
		}
		void remainder() {
			result = num1%num2;
			System.out.println("The remainder is  " +result);
		}
		void productNumbbers() {
			result = num1*num2;
			System.out.println("The product of this two numbers are "+result);
		}
		void addNumbers() {
			result = num1+num2;
			System.out.println("The sum of the two numbers are "+result);
		}
		void SubNumbers() {
			result = num1-num2;
			System.out.println("The difference of these numbers is "+result);
		}

	
}
