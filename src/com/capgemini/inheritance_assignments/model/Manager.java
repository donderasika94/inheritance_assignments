package com.capgemini.inheritance_assignments.model;

public class Manager extends Employee{
	
    double petrolAllowance;
    double foodAllowance;
    double otherAllowance;
	double netSalary;

	public Manager() {
		super();
		
	}

	public Manager(int employeeId, String employeeName, double employeeSalary, double medical) {
		super(employeeId, employeeName, employeeSalary, medical);
		
	}
	
	@Override
	public double getGrossSalary() {
		double petrolAllowance = 0.08 * getEmployeeSalary();
		double foodAllowance = 0.13 * getEmployeeSalary();
		double otherAllowance = 0.03 * getEmployeeSalary();
		return super.getGrossSalary() + (petrolAllowance + foodAllowance + otherAllowance);
	}
	
	public double calculateNetSalary() {
		double PT = 200;
		double pF = 0.12 * getEmployeeSalary();
		netSalary = getGrossSalary() - (pF + PT);
		return netSalary;
	}

}
