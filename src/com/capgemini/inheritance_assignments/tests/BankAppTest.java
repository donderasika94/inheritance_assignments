package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance_assignments.model.BankApp;

public class BankAppTest {
	private BankApp bankApp;
	
	@Before
	public void setup() {
		bankApp = new BankApp(987456,"Tom","SAVING",50000);
	}
	
	@Test
	public void testBankAppClassObjects() {
		BankApp bankApp = new BankApp();
		assertNotNull(bankApp);
	}
	
	@Test
	public void testBankAppClassCreatedConstructor() {
		BankApp bankApp = new BankApp(123098,"Aditi","SAVING",45000);
		assertEquals(123098,bankApp.getAccountId());
		assertEquals("Aditi",bankApp.getAccountHolderName());
		assertEquals("SAVING",bankApp.getAcoountType());
		assertEquals(45000,bankApp.getAccountBalance(),0.02);
	}
	
	@Test
	public void testBankAppWithdrawMethod() {
		assertEquals(10000,bankApp.withdraw(40000),0.02);
	}
	
	@Test
	public void testBankAppWithdrawMethodWithExcessAmount() {
		bankApp.withdraw(55000);
	}
	
	@Test
	public void testBankAppDepositMethod() {
		assertEquals(60000,bankApp.deposit(10000),0.02);
	}


}
