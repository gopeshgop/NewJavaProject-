package assignmentBankOperationsApril29;

public class ATM extends BankOperations {

	
	
	public ATM(String operationToPerform, double accountBalance, double amountEnteredByUser) {
		
		super(operationToPerform, accountBalance, amountEnteredByUser );
	}
	double balanceUpdated = viewBalance();
}
