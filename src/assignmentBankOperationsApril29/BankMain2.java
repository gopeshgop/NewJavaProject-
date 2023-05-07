package assignmentBankOperationsApril29;

import java.util.Scanner;

public class BankMain2 {

	public static void main(String[] args) {
		double accountBalance = 0;
		double withdrawAmount = 0;
		double depositAmount = 0;
		String serviceSelected;
		double accountBalanceAfterOperation;
		String newPin = "";
		String newPassWord = "";

		Scanner sc = new Scanner(System.in);
		BankOperations bankOperations = null;

		PersonAccountDetails personAccountDetails = new PersonAccountDetails("123245", "Gopesh", 20000, "2341",
				"Get@1");

		System.out.println("Enter your option - ATM or Online");
		serviceSelected = sc.next();
		if (serviceSelected.equalsIgnoreCase("ATM")) {
			System.out.println("Enter your ATM PIN to proceed further");
			String atmPinToCheck = sc.next();
			accountBalance = personAccountDetails.atmPinCheck(atmPinToCheck);

			if (accountBalance != 0) {

				System.out.println("Enter operation to perform");
				System.out.println("Withdraw / Deposit / Balance / changePIN");
				String optionEntered = sc.next();
				if (optionEntered.equalsIgnoreCase("Withdraw")) {
					bankOperations = new ATM(accountBalance);
					bankOperations.withdrawOrTransfer();
				} else if (optionEntered.equalsIgnoreCase("Deposit")) {
					bankOperations = new ATM(accountBalance);
					bankOperations.depositOrRecieve();

				} else if (optionEntered.equalsIgnoreCase("Balance")) {
					bankOperations = new ATM(accountBalance);
				} else if (optionEntered.equalsIgnoreCase("change")) {
					bankOperations = new ATM(atmPinToCheck);
					bankOperations = new ATM(accountBalance);
					bankOperations.changePinPassword();
					newPin = bankOperations.getNewPinPassword();
					personAccountDetails.setNewPin(newPin);

				}

				else {
					System.out.println("Wrong option selected");
				}
				personAccountDetails.setTotalFundAvailable(bankOperations.getAccountBalance());
				System.out.println("The balance in your account is " + personAccountDetails.getTotalFundAvailable());

			}

		} else if (serviceSelected.equalsIgnoreCase("Online")) {
			System.out.println("Enter your Online Password to proceed further");
			String passwordEnteredToCheck = sc.next();
			accountBalance = personAccountDetails.onlineBankingPasswordCheck(passwordEnteredToCheck);

			if (accountBalance != 0) {

				System.out.println("Enter your option\n Balance\nChange Password");
				String optionEntered = sc.next();

				if (optionEntered.equalsIgnoreCase("Balance")) {
					bankOperations = new Online_Banking(accountBalance);
					bankOperations.getAccountBalance();
					accountBalanceAfterOperation = bankOperations.getAccountBalance();
					personAccountDetails.setTotalFundAvailable(accountBalance);
					System.out.println("The balance in your account is " + accountBalanceAfterOperation);

				} else if (optionEntered.equalsIgnoreCase("change")) {
					bankOperations = new Online_Banking(passwordEnteredToCheck);
					bankOperations = new Online_Banking(accountBalance);
					bankOperations.changePinPassword();
					newPassWord = bankOperations.getNewPinPassword();
					personAccountDetails.setNewPassword(newPassWord);

				} else {
					System.out.println("Wrong option");
				}

				
			} else {
				System.out.println("Wrong password entered");
			}

		} else {
			System.out.println("Enter a correct option");
		}
	}

}
