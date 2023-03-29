package march24;

public class IfElse {
	int n1,n2,n3;
	void findLargestNum() {
		if(n1>n2) {
			if(n1>n3) {
			System.out.println("The largest number = "+n1);
			}
			else
			{
				System.out.println("The largest number is = "+n3);
			}
		}
		else {
			if(n2>n3) {
			System.out.println("The largest number = "+n2);
			}
			else {
				System.out.println("The largest number = "+n3);
			}
		}
	}
		
	
	

}
