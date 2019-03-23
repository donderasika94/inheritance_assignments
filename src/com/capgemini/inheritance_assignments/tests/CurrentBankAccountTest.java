package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance_assignments.model.CurrentBankAccount;

public class CurrentBankAccountTest {

	private CurrentBankAccount currentBankAccount;

	@Before
	public void setup() {
		currentBankAccount = new CurrentBankAccount(123456, "Elena", "CURRENT", 60000, 10000);
	}

	@Test
	public void testCurrentBankAccountClassCreatedCostructor() {
		CurrentBankAccount currentBankAccount = new CurrentBankAccount();
		assertNotNull(currentBankAccount);
	}

	@Test
	public void testCurrentbankAccountClassCreatedparameterizedconstructor() {
		CurrentBankAccount currentBankAccount = new CurrentBankAccount(1111222, "Sam", "CURRENT", 50000, 10000);
		assertEquals(1111222, currentBankAccount.getAccountId());
		assertEquals("Sam", currentBankAccount.getAccountHolderName());
		assertEquals("CURRENT", currentBankAccount.getAcoountType());
		assertEquals(50000, currentBankAccount.getAccountBalance(), 0.02);
		assertEquals(10000, currentBankAccount.getDebitLimit(), 0.03);
		assertNotNull(currentBankAccount);
	}

	@Test
	public void testCurrentBankAccountWithdrawAmount() {
		assertEquals(30000, currentBankAccount.withdraw(30000), 0.02);
	}

	@Test
	public void testCurrentBankAccountWithdrawMethod() {
		assertEquals(0, currentBankAccount.withdraw(70000), 0.02);
		currentBankAccount.getBorrowedAmount();
	}

	@Test
	public void testCurrentBankAccountWithdrawMethodExcessAmount() {
		currentBankAccount.withdraw(80000);
	}

	@Test
	public void testCurrentBankAccountDepositMethod() {
		currentBankAccount.withdraw(70000);
		currentBankAccount.deposit(15000);
		assertEquals(5000, currentBankAccount.getAccountBalance(), 0.02);
	}

	@Test
	public void testcurrentBankAccountDepositMethodWithBorrowedAmountPending() {
		currentBankAccount.withdraw(65000);
		currentBankAccount.deposit(2000);
		assertEquals(0, currentBankAccount.getAccountBalance(), 0.02);
	}

}
