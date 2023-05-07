package assignmentBankOperationsApril29;

import java.util.Scanner;

public abstract class BankOperations {
	private double accountBalance = 0;
	private double withdrawAmount = 0;
	private double depositAmount = 0;
	private String newPin="";

	Scanner sc = new Scanner(System.in);
	
	abstract void changePinPassword();

	void withdrawOrTransfer() {

		System.out.println("Enter the amount to withdraw");
		int dailyLimit = 2000;
		withdrawAmount = sc.nextDouble();

		if (accountBalance > withdrawAmount || withdrawAmount < dailyLimit) {
			accountBalance -= withdrawAmount;
		} else {
			System.out.println("You dont have enough balance or enter a lesser amount");
		}
		
	

	}

	void depositOrRecieve() {

		System.out.println("Enter the amount to deposit");
		depositAmount = sc.nextDouble();
		accountBalance += depositAmount;
		
	}

	double getAccountBalance() {
		return accountBalance;
	}
	
	String getNewPinPassword() {
		return newPin;
	}
	

	public BankOperations(double accountBalance) {
		this.accountBalance = accountBalance;
		

	}
	public BankOperations() {
		
	}
}
