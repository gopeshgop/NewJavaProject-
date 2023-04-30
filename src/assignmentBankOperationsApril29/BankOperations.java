package assignmentBankOperationsApril29;

public class BankOperations {
	private double accountBalanceRecievedFromCustomer=0;
	double withdrawnAmount;
	double depositAmount;
	
	
	void withdraw(double withdrawAmount) {
		accountBalanceRecievedFromCustomer-=withdrawAmount;
	}
	

	void deposit(double depositAmount) {
		accountBalanceRecievedFromCustomer+=depositAmount;
		
	}
	
	double viewBalance() {
		return accountBalanceRecievedFromCustomer;
	}
	
	public BankOperations(String operationToPerform, double accountBalance, double amountEnteredByUser ) {
		accountBalanceRecievedFromCustomer=accountBalance;
		if(operationToPerform.equalsIgnoreCase("Withdraw")||operationToPerform.equalsIgnoreCase("Send")) {
			withdrawnAmount=amountEnteredByUser;
		}else if(operationToPerform.equalsIgnoreCase("Deposit")||operationToPerform.equalsIgnoreCase("Recieve")) {
			depositAmount=amountEnteredByUser;
		}else {
			System.out.println("Wrong entry");
		}
	}
}
