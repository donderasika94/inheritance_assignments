package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance_assignments.model.MarketingExecutive;

class MarketingExecutiveTest{
	
	private MarketingExecutive marketingexecutive;
	@BeforeEach
	public void setUp() {
	 marketingexecutive = new MarketingExecutive(101,"Nitesh",20000,5000,125); 
	}

	@Test
	public void testManagerExecutiveClassAddedDefaultConstructor() {
		MarketingExecutive marketingexecutive = new MarketingExecutive();
		assertNotNull(marketingexecutive);
	}
	
	@Test
	public void testManagerExecutiveClassAddedParameterizedConstructor() {
		MarketingExecutive marketingexecutive = new MarketingExecutive(101,"Nitesh",20000,5000,125);
		assertNotNull(marketingexecutive);
		assertEquals(101,marketingexecutive.getEmployeeId());
		assertEquals("Nitesh",marketingexecutive.getEmployeeName());
		assertEquals(20000,marketingexecutive.getEmployeeSalary(),0.02);
		assertEquals(5000,marketingexecutive.getMedical(),0.02);
		assertEquals(125,marketingexecutive.getKilometerTravelled());
	}
	
	@Test
	public void testManagerExecutiveGrosssalaryWithAllowance() {
		assertEquals(37125,marketingexecutive.getGrossSalary(),0.02);
	}
	
	@Test
	public void testCalculateNetsalary() {
		marketingexecutive.getGrossSalary();
		assertEquals(34525, marketingexecutive.calculateNetSalary(),0.02);
	}
	
}
