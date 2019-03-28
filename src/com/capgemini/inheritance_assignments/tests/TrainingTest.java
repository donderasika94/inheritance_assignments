package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.inheritance_assignments.model.CorporateTraining;
import com.capgemini.inheritance_assignments.model.PublicTraining;
import com.capgemini.inheritance_assignments.model.Training;


public class TrainingTest {
	@Test
	public void testGetOrderValueOfPublicTraining() {
		Training training = new PublicTraining(117,"Java",5000,50);
		assertEquals(250000,training.getOrdervalue(),0.02);
	}
	
	@Test
	public void testGetOrderValueOfCorporateTraining() {
		Training training = new CorporateTraining(118,"Big Data",35000,5);
		assertEquals(175000,training.getOrdervalue(),0.02);
	}
	
	

	

}
