package com.capgemini.inheritance_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance_assignments.model.PublicTraining;
import com.capgemini.inheritance_assignments.model.Training;


public class PublicTrainingTest {
	 Training publicTraining;
	@Before
	public void setUp() {
		publicTraining = new PublicTraining(117,"Java",5000,50);
	}
	
	@Test
	public void testPublicTrainingConstructor() {
		PublicTraining publicTraining = new PublicTraining();
		assertNotNull(publicTraining);
	}
	
	@Test
	public void testPublicTrainingParameterizedConstructor() {
		PublicTraining publicTraining = new PublicTraining(117,"Java",5000,50);
		assertEquals(117,publicTraining.getTrainingId());
		assertEquals("Java",publicTraining.getSubject());
		assertEquals(5000,publicTraining.getFees(),0.02);
		assertEquals(50,publicTraining.getParticipants());			
	}
	
	@Test
	public void testGetOedervalueMethod() {
		assertEquals(250000, publicTraining.getOrdervalue(),0.02);
	}

}
