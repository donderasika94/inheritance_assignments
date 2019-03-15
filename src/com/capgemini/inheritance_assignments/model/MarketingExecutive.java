package com.capgemini.inheritance_assignments.model;

public class MarketingExecutive extends Employee{
	
	private int kilometerTravelled;
	double tourAllowance;
	int telephoneAllowance;
	double netSalary;

	public MarketingExecutive() {
		super();
		
	}

	public MarketingExecutive(int employeeId, String employeeName, double employeeSalary, double medical,int kilometerTravelled) {
		super(employeeId, employeeName, employeeSalary, medical);
		this.kilometerTravelled = kilometerTravelled;
	}

	public int getKilometerTravelled() {
		return kilometerTravelled;
	}

	public void setKilometerTravelled(int kilometerTravelled) {
		this.kilometerTravelled = kilometerTravelled;
	}
	
	@Override
	public double getGrossSalary() {
		int telephoneAllowance = 1500;
		tourAllowance = 5 * kilometerTravelled;
		return super.getGrossSalary() + (telephoneAllowance + tourAllowance);
	}
	
	public double calculateNetSalary() {
		double PT = 200;
		double pF = 0.12 * getEmployeeSalary();
		netSalary = getGrossSalary() - (pF + PT);
		return netSalary;
	}
	
	
	
	
	

}
