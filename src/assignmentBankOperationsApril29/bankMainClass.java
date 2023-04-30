package assignmentBankOperationsApril29;

import java.util.Scanner;

public class bankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperations bankOperations = null;
		PersonAccountDetails personAccountDetails = new PersonAccountDetails();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the which service you want ATM or Online");
		String serviceSelected = sc.next();

		if (serviceSelected.equalsIgnoreCase("ATM")) {

			System.out.println("Enter the ATM pin to proceed further");
			Double accountBalance = personAccountDetails.getThePinToCheck(sc.nextInt());
			if (accountBalance != 0) {
				System.out.println("Enter the operation you want to perform");
				System.out.println("Withdraw, Deposit ");
				String operationToPerform = sc.next();
				System.out.println("Please enter the amount");
				double amountEnteredByUser = sc.nextDouble();

				bankOperations = new ATM(operationToPerform, accountBalance, amountEnteredByUser);
				if (operationToPerform.equalsIgnoreCase("Withdraw")) {
					bankOperations.withdraw(amountEnteredByUser);
				} else if (operationToPerform.equalsIgnoreCase("Deposit")) {
					bankOperations.deposit(amountEnteredByUser);
				} else {
					System.out.println("You have entered wrong option");
				}
				accountBalance = bankOperations.viewBalance();
				personAccountDetails.getTotalFundAvailable(accountBalance);

				System.out.println(
						"The current balance in the account is " + personAccountDetails.setTotalFundAvailable());
			} else {
				System.out.println("You have entered wrong PIN");
			}

		} else if (serviceSelected.equalsIgnoreCase("Online")) {
			System.out.println("Enter the OnlineBanking password to proceed further");
			Double accountBalance = personAccountDetails.getTheOnlineBankingPasswordToCheck(sc.next());
			if (accountBalance != 0) {
				System.out.println("Enter the operation you want to perform");
				System.out.println("Send, Recieve, Balance ");
				String operationToPerform = sc.next();
				double amountEnteredByUser = 0;

				if (operationToPerform.equalsIgnoreCase("Send")) {

					System.out.println("Please enter the amount");
					amountEnteredByUser = sc.nextDouble();
					bankOperations = new Online_Banking(operationToPerform, accountBalance, amountEnteredByUser);
				} else if (operationToPerform.equalsIgnoreCase("Recieve")) {

					System.out.println("Please enter the amount");
					amountEnteredByUser = sc.nextDouble();
					boolean amountRecieved = true;
					if (amountRecieved) {
						bankOperations = new Online_Banking(operationToPerform, accountBalance, amountEnteredByUser);
					}else {
						System.out.println("Amount is not yet recieved");
					}

				} else {

					System.out.println("You have entered wrong option");

				}

				accountBalance = bankOperations.viewBalance();
				personAccountDetails.getTotalFundAvailable(accountBalance);

				System.out.println(
						"The current balance in the account is " + personAccountDetails.setTotalFundAvailable());
			} else {
				System.out.println("You have entered wrong Password");
			}
		} else {
			System.out.println("You have entered wrong Option");
		}
	}

}
