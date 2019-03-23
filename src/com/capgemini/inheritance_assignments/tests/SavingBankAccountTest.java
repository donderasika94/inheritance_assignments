package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance_assignments.model.SavingBankAccount;

public class SavingBankAccountTest {
	
	private SavingBankAccount savingBankAccount;
	private SavingBankAccount savingBankAccount1;
	
	@Before
	public void setUp() {
	 savingBankAccount = new SavingBankAccount(76890,"Damon","SAVING",50000,true);		
	 savingBankAccount1 = new SavingBankAccount(76869,"Stefan","SAVING",60000,false);	
	}
	
	@Test
	public void testSavingBankAccountCreatedDefaultConstructor() {
		SavingBankAccount savingBankAccount = new SavingBankAccount();
		assertNotNull(savingBankAccount);
	}
	
	@Test
	public void testSavingbankAccountCreatedParameterizedConstructor() {
		SavingBankAccount savingBankAccount = new SavingBankAccount(123409,"Tim","SAVING",45000,true);
		assertEquals(123409,savingBankAccount.getAccountId());
		assertEquals("Tim",savingBankAccount.getAccountHolderName());
		assertEquals("SAVING",savingBankAccount.getAcoountType());
		assertEquals(45000,savingBankAccount.getAccountBalance(),0.02);
		assertEquals(true,savingBankAccount.isSalaryAccount());
		assertNotNull(savingBankAccount);
	}
	
	@Test
	public void testSavingBankAccountWithdrawMethod() {	
		assertEquals(10000,savingBankAccount.withdraw(40000),0.02);
	}
	
	@Test
	public void testSavingBankAccountWithdrawMenthodForNonSalaryAccount() {
		assertEquals(20000,savingBankAccount1.withdraw(40000),0.02);
	}
	
	@Test
	public void testSavingBankAccountWithdrawMethodForNonSalaryAccountWithExcessAmount() {
		savingBankAccount1.withdraw(55000);
	}


}
