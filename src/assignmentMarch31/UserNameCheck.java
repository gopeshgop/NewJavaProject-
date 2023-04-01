package assignmentMarch31;
import java.util.Scanner; 

public class UserNameCheck {
	String userId, passWord;
	Scanner sc = new Scanner(System.in);
	
	void checkCredential() {
		for(int i=0;i<3;i++) {
			System.out.println("Enter your User Id");
			userId=sc.next();
			System.out.println("Enter your Password");
			passWord=sc.next();			
			if(userId=="pivotAdmin" && passWord=="Admin123") {
				System.out.println("You are logged in to the application");
				break;
			}
			else {
				System.out.println("Incorrect user id or password");
				if(i==2) {
					System.out.println("Your account is blocked");
					break;
				}
			}
			
			
		}
	}
}
