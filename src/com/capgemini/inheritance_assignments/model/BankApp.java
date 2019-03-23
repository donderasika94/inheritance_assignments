package com.capgemini.inheritance_assignments.model;

public class BankApp {
	private long accountId;
	private String accountHolderName;
	private String acoountType;
	private double accountBalance;
	
	//Default Constructor
	public BankApp() {
		super();		
	}
	
	//Parameterized Constructor
	public BankApp(long accountId, String accountHolderName, String acoountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.acoountType = acoountType;
		this.accountBalance = accountBalance;
	}
	
	//Getter-Setter methods
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAcoountType() {
		return acoountType;
	}
	public void setAcoountType(String acoountType) {
		this.acoountType = acoountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double withdraw(double amount) {
		if(accountBalance >= amount) {
			accountBalance = accountBalance - amount;			
		}
		else
			System.out.println("You dont have sufficient balance");
		return accountBalance;
	}
	
	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		return accountBalance;
	}	

}
