package com.capgemini.inheritance_assignments.model;

public class PublicTraining extends Training{
	private int participants;

	public PublicTraining() {
		super();
	}

	public PublicTraining(int trainingId, String subject, double fees, int participants) {
		super(trainingId, subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	@Override
	public double getOrdervalue() {
		return getFees() * participants;
	}
	

}
