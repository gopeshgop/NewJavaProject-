package assignmentBankOperationsApril29;

public class Online_Banking extends BankOperations {
	private double accountBalance = 0;
	private double withdrawOrDepositAmount = 0;
	String oldPassWord="";
	String newPassWord="";

	public Online_Banking(double accountBalance) {
		super(accountBalance);

	}
	
	public Online_Banking(String oldPassWord) {

		super();
		this.oldPassWord=oldPassWord;

	}

	
	@Override
	void changePinPassword() {
		System.out.println("Enter the new password");
		String passwordEnteredToCheck = sc.next();
		if (passwordEnteredToCheck.length() > 8) {

			if (!(oldPassWord.equals(passwordEnteredToCheck))) {
				
				if(passwordEnteredToCheck.contains("@") || passwordEnteredToCheck.contains("$")||passwordEnteredToCheck.contains("&")) {
					newPassWord=passwordEnteredToCheck;
					System.out.println("You have changed your password  ");
				}else {
					System.out.println("Your password must contain @ / & / $");
				}
				
			}else {
				System.out.println("You cannot use old password");
			}
		} else {
			System.out.println("Password should be atleast 8 digit");
		}

	}
	
	@Override
	String getNewPinPassword() {
		// TODO Auto-generated method stub
		return newPassWord;
	}
	
	
}
