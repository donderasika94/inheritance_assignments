package com.capgemini.inheritance_assignments.model;

public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining() {
		super();		
	}
	public CorporateTraining(int trainingId, String subject, double fees, int days) {
		super(trainingId, subject, fees);
		this.days = days;	
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	@Override
	public double getOrdervalue() {
		return getFees() * days;
	}
}
