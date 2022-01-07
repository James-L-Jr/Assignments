package com.hcl.james.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	public static void main(String[] args) {
		// Generate a new hibernate configuration object
		Configuration hibernateCfg = new Configuration();

		// Configure the hibernate configuration using a xml file
		hibernateCfg = hibernateCfg.configure("hibernate.cfg.xml");

		// Create and bind a session factory to the new hib cfg object
		SessionFactory sessionFactory = hibernateCfg.buildSessionFactory();

		// Open the session factory
		Session session = sessionFactory.openSession();
		// The id will be ignored because the hib cfg specifies it is a generated column
		
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setInsertTime(new Date());
		emp.setName("Pankaj");
		emp.setRole("CEO");
		session.save(emp);
		session.save(new Student(0001, "Alice", "Wonderland", "Freshman"));
		session.save(new Student(0002, "Bob", "Builder", "Sophomore"));
		session.save(new Teacher(0003, "Chuck", "Cheese", "Junior"));
		session.save(new Teacher(0004, "Dan", "Marino", "Senior"));

		transaction.commit();

		session.close();
		sessionFactory.close();
	}
}
