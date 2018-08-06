package com.deloitte.pojo;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import java.util.List;
import org.hibernate.Query;

import javax.persistence.Query;

public class ManageEmployee {
	public static SessionFactory factory;

	public static void main(String[] args) {

		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		ManageEmployee ME = new ManageEmployee();

		/* Add few employee records in database */
		Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = ME.addEmployee("John", "Paul", 10000);

		/* List down all the employees */
		ME.listEmployees();
		//ME.updateEmployee(empID1, 5000);
		//ME.listEmployees();
		//ME.deleteEmployee(empID2);
		//ME.listEmployeeEntityBest2();
		//ME.countEmployee();
		//ME.totalSalary();

	}

	/* Method to CREATE an employee in the database */
	public Integer addEmployee(String fname, String lname, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx= session.beginTransaction();
			Employee employee = new Employee(fname, lname, salary);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}

	/* Method to READ all the employees */
	public void listEmployees() {
		Session session = null;
		session = factory.openSession();
		Transaction tx = null;
		List employees;

		try {
			tx = session.beginTransaction();
			employees = session.createQuery("FROM Employee").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print("  Last Name: " + employee.getLastName());
				System.out.println("  Salary: " + employee.getSalary());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	
	}
	
	public void listEmployeeEntityNS() {
		
		Session session = factory.openSession();
		Transaction tx = null;
	
	
	try {
		tx = session.beginTransaction();
		String sql ="SELECT * FROM EMPLOYEE";
		SQLQuery query =session.createSQLQuery(sql);
		query.addEntity(Employee.class);
		List employees=query.list();
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.print("First Name: " + employee.getFirstName());
			System.out.print("  Last Name: " + employee.getLastName());
			System.out.println("  Salary: " + employee.getSalary());
		}
		tx.commit();
	} catch (HibernateException e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
	} finally {
		session.close();
	}
	}
	
	public void updateEmployee(Integer EmployeeID, int salary ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
	         employee.setSalary( salary );
	     session.update(employee); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	
	/* Method to DELETE an employee from the records */
	   public void deleteEmployee(Integer EmployeeID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
	         session.delete(employee); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	  /*public void listEmployeeEntityBest2() {
			
			Session session = factory.openSession();
			Transaction tx = null;
			List employees;
		
		try {
			tx = session.beginTransaction();
			String hql ="SELECT * FROM EMPLOYEE";
			Query query = session.createQuery(hql);
			//query.addEntity(Employee.class);
			query.setFirstResult(1);
			query.setMaxResults(10);
			employees=query.list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print("  Last Name: " + employee.getLastName());
				System.out.println("  Salary: " + employee.getSalary());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		}*/
	   
	   public void countEmployee(){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Criteria cr = session.createCriteria(Employee.class);

		         // To get total row count.
		         cr.setProjection(Projections.rowCount());
		         List rowCount = cr.list();

		         System.out.println("Total Count: " + rowCount.get(0) );
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }
		  
		   /* Method to print sum of salaries */
		   public void totalSalary(){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Criteria cr = session.createCriteria(Employee.class);

		         // To get total salary.
		         cr.setProjection(Projections.sum("salary"));
		         List totalSalary = cr.list();

		         System.out.println("Total Salary: " + totalSalary.get(0) );
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }


}
