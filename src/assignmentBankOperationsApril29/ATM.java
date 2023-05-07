package assignmentBankOperationsApril29;

public class ATM extends BankOperations {
	private double accountBalance = 0;
	private double withdrawOrDepositAmount = 0;
	private String oldPin = "";
	private String newPin="";

	public ATM(double accountBalance) {

		super(accountBalance);

	}
	
	public ATM(String oldPin) {

		super();
		this.oldPin=oldPin;

	}

	@Override
	void changePinPassword() {
		System.out.println("Enter the new pin");
		String newUserEnteredPin = sc.next();
		if (newUserEnteredPin.length() == 4) {

			if (!(newUserEnteredPin.equals(oldPin))) {
				
				newPin=newUserEnteredPin;
				System.out.println("You have set a new PIN \nNew PIN is "+newPin);
			}else {
				System.out.println("You cannot enter old PIN");
			}
		} else {
			System.out.println("Please enter 4 digit");
		}

	}
	 @Override
	String getNewPinPassword() {
		// TODO Auto-generated method stub
		return newPin;
	}

	
	
}
