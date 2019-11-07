package com.lti.Annotations;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session= new Configuration().configure("employee.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		Employee e1=new Employee();
		
		e1.setId(20);
		e1.setFname("Pattric");
		e1.setLname("Lee");
		
		session.persist(e1);//persisting the obj
		t.commit();//transaction is committed
		session.close();
	}

}
