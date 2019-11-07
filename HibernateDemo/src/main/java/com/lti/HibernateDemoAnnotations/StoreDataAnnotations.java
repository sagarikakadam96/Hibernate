package com.lti.HibernateDemoAnnotations;


import org.hibernate.*;    
import org.hibernate.cfg.*;

//storing employee obj to db
public class StoreDataAnnotations {

	public static void main(String[] args) {
		
		
		Session session= new Configuration().configure("hibernateannotation.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		EmployeeAnnotations e=new EmployeeAnnotations();
		e.setId(1);
		e.setFname("Happy");
		e.setLname("Singh");
		
		
		session.persist(e);

		t.commit();//transaction is committed
		
		session.close();
	}

}
