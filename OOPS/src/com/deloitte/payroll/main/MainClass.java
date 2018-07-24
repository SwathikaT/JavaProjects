package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.Contract;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.Interns;

public class MainClass {

	public static void main(String[] args) {
		
		/*//ConfirmedEmployee employee = new ConfirmedEmployee();
		//polymorphism also possible instead
		Employee employee = new ConfirmedEmployee();
		employee.netSalary();*/
		
		/*ConfirmedEmployee confirmedemployee = new ConfirmedEmployee();
		Accounts accounts = new Accounts();
		accounts.processSalary(confirmedemployee);
		Interns intern = new Interns();
		accounts.processSalary(intern);
		Contract contract = new Contract();
		accounts.processSalary(contract);*/
		
		Accounts accounts = new Accounts();
		HR hr = new HR();
		Employee employee;
		employee = hr.recruit('C');
		accounts.processSalary(employee);
		
		employee = hr.recruit('I');
		accounts.processSalary(employee);
		
		employee = hr.recruit('P');
		accounts.processSalary(employee);
		
	}

}
