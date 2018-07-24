package com.deloitte.payroll;

public class Accounts {
	//public void processSalary(ConfirmedEmployee employee)
	//Go for a generalised type, polymorphic argument !!!
	public void processSalary(Employee employee) {
		if(employee!=null) {
			//use instanceof to test the type of the object
			if(employee instanceof ConfirmedEmployee) {
				//restore full functionality of object
				ConfirmedEmployee confirmedEmployee = (ConfirmedEmployee)employee;
				confirmedEmployee.transportFacility();
			}
			employee.netSalary();
		}
	}
		
}
