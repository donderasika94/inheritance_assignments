package com.capgemini.inheritance_assignments.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private double medical;
	private double hRA;	
	private double pF;
	private double PT;
	private double grossSalary;
	private double netSalary;
	
	
	
	
	public Employee() {
		super();
		
	}

	public Employee(int employeeId, String employeeName, double employeeSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	public double getGrossSalary() {
		hRA = 0.50 * employeeSalary;
		grossSalary = employeeSalary + hRA + medical;
		return grossSalary;			
	}
	
	public double getNetsalary() {
		PT = 200;
		pF = 0.12 * employeeSalary;
		netSalary = grossSalary - (pF + PT);
		return netSalary;		
	}
	
	
	
	

}
