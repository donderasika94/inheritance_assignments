package com.capgemini.inheritance_assignments.model;

public abstract class Training {
	private int trainingId;
	private String subject;
	private double fees;
	public Training() {
		super();
	}
	public Training(int trainingId, String subject, double fees) {
		super();
		this.trainingId = trainingId;
		this.subject = subject;
		this.fees = fees;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public abstract double getOrdervalue();
}
