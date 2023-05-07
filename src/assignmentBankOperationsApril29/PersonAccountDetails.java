package assignmentBankOperationsApril29;

public class PersonAccountDetails {

	private String bankAccountNumber;
	private String nameOfTheAccountHolder;
	private double totalFundsAvailable;
	private String actualPin;
	private String actualOnlineBankingPassword;

	PersonAccountDetails(String bankAccountNumber, String nameOfTheAccountHolder, double totalFundsAvailable,
			String actualPin, String actualOnlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.nameOfTheAccountHolder = nameOfTheAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
		this.actualPin = actualPin;
		this.actualOnlineBankingPassword = actualOnlineBankingPassword;
	}

	double atmPinCheck(String pinEnteredByUser) {
		if (actualPin.equals(pinEnteredByUser)) {
			return totalFundsAvailable;
		} else {
			System.out.println("Wrong PIN");
			return 0;
		}
	}

	double onlineBankingPasswordCheck(String passwordEnteredByTheUser) {
		if(actualOnlineBankingPassword.equals(passwordEnteredByTheUser)){
			return totalFundsAvailable;
		}else {
			System.out.println("Wrong password");
			return 0;
		}
	}

	void setTotalFundAvailable(double accountBalance) {
		totalFundsAvailable = accountBalance;
	}

	double getTotalFundAvailable() {
		return totalFundsAvailable;
	}
	
	void setNewPin(String newPin) {
		actualPin=newPin;
	}
	void setNewPassword(String newPassword) {
		actualOnlineBankingPassword=newPassword;
	}
}
