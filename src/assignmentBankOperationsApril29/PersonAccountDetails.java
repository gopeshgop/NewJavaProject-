package assignmentBankOperationsApril29;

public class PersonAccountDetails {
	
	private String bankAccountNumber="100000110";
	private String nameOfTheAccountHolder="Gopesh";
	private double totalFundsAvailable=20000;
	private int actualPin=2341;
	private String actualOnlineBankingPassword="Get@1";
	
	
	double getThePinToCheck(int pinEnteredByUser) {
		if(actualPin==pinEnteredByUser) {
			return totalFundsAvailable;
		}else {
			return 0;
		}
	}
	
	double getTheOnlineBankingPasswordToCheck(String passwordEnteredByTheUser) {
		if(actualOnlineBankingPassword.equals(passwordEnteredByTheUser)) {
			return totalFundsAvailable;
		}else {
			return 0;
		}
	}
	void getTotalFundAvailable(double accountBalance) {
		totalFundsAvailable=accountBalance;
	}
	double setTotalFundAvailable() {
		return totalFundsAvailable;
	}
}
