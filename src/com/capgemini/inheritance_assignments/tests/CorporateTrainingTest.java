package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance_assignments.model.CorporateTraining;
import com.capgemini.inheritance_assignments.model.Training;

public class CorporateTrainingTest {
	Training corporateTraining;
	@Before
	public void setUp() {
		corporateTraining = new CorporateTraining(118,"Big Data",35000,5);
	}
	@Test
	public void testCorporateTrainingClass() {
		CorporateTraining corporateTraining = new CorporateTraining(118,"Big Data",35000,5);
		assertEquals(118,corporateTraining.getTrainingId());
		assertEquals("Big Data",corporateTraining.getSubject());
		assertEquals(35000,corporateTraining.getFees(),0.02);
		assertEquals(5,corporateTraining.getDays());
		assertNotNull(corporateTraining);
	}
	
	public void testGetOrderValueMethod() {
		assertEquals(175000,corporateTraining.getOrdervalue(),0.02);
	}



}
