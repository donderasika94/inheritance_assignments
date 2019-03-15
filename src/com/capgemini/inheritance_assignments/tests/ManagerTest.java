package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance_assignments.model.Manager;

class ManagerTest {
	private Manager manager;
	
	@BeforeEach
	public void setup() {
		manager = new Manager(101,"Nitesh",20000,5000);
	}
	
	@Test
	public void testManagerClassCreatedDefaultConstructor() {
		Manager manager = new Manager();
		assertNotNull(manager);
	}
	
	@Test 
	public void testManagerClassCreatedParameterizedConstructor() {
		Manager manager = new Manager(101,"Nitesh",20000,5000);
		assertNotNull(manager);
		assertEquals(101, manager.getEmployeeId());
	    assertEquals("Nitesh",manager.getEmployeeName());
	    assertEquals(20000,manager.getEmployeeSalary(),0.01);
	    assertEquals(5000,manager.getMedical(),0.01);
	}
	
	@Test
	public void testGrossSalaryWithAllAllowance() {
		assertEquals(39800, manager.getGrossSalary(),0.01);
	}
	
	@Test 
	public void testNetSalaryWithUpdatedGrossSalary() {
		manager.getGrossSalary();
		assertEquals(37200, manager.calculateNetSalary(),0.02);
	}

}
