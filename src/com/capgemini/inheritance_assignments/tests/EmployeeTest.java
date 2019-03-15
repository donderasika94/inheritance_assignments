package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance_assignments.model.Employee;

public class EmployeeTest {
	
	private Employee employee;
	
	@BeforeEach
	public void setUp() {
		employee = new Employee(101,"Nitesh",20000,5000);	
	}

	@Test
	public void testEmployeeObjectCreatedDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);		
	}
	
	@Test 
	public void testEmployeeObjectCreatedParameterizedConstructor() {
		Employee employee = new Employee(101,"Nitesh",20000,5000);
		assertNotNull(employee);
		assertEquals(101,employee.getEmployeeId());
		assertEquals("Nitesh", employee.getEmployeeName());
		assertEquals(20000, employee.getEmployeeSalary(),0.01);
		assertEquals(5000,employee.getMedical(),0.01);	
	}
	
	@Test
	public void testEmployeeGrossSalary() {
		assertEquals(35000, employee.getGrossSalary(),0.01);		
	}
	
	@Test
	public void testEmployeeNetSalary() {
		employee.getGrossSalary();
		assertEquals(32400,employee.getNetsalary(),0.02);
	}
	

}
