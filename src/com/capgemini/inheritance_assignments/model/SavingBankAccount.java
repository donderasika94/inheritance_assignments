package com.capgemini.inheritance_assignments.model;

public class SavingBankAccount extends BankApp {
	
	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE = 10000;
	
	public SavingBankAccount() {
		super();	
	}
	
	public SavingBankAccount(long accountId, String accountHolderName, String acoountType, double accountBalance, boolean salaryAccount) {
		super(accountId, accountHolderName, acoountType, accountBalance);
		this.salaryAccount = salaryAccount;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	
	@Override
	public double withdraw(double amount) {
		if (salaryAccount) {
			return super.withdraw(amount);
		} else {
			if (getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount);
			else {
				System.out.println("you don't have sufficient fund.");
				System.out.println("You have to maintain Minimum Balance of Rs.10000");
			}		
			return getAccountBalance();
		}
	}
	
	
	
 

}
