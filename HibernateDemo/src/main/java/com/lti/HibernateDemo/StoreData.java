package com.lti.HibernateDemo;

import org.hibernate.Session;    
import org.hibernate.SessionFactory; // interface provides factory method to get the object of Session 
import org.hibernate.Transaction; // interface provides methods to insert, update and delete the object
import org.hibernate.cfg.Configuration; //interface provides methods for transaction management

//storing employee obj to db
public class StoreData {

	public static void main(String[] args) {

		//creating configuration obj
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); //populates data of configuration file
		
		//creating session factory obj (factory of session and client of ConnectionProvider)
		SessionFactory factory=cfg.buildSessionFactory(); //holds second level cache (optional) of data
		
		//creating session obj (object provides an interface between the application and data stored in the database)
		Session session=factory.openSession(); //holds a first-level cache (mandatory) of data
		
		//creating transaction obj (object specifies the atomic unit of work. It is optional.)
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setId(115);
		e1.setFname("sava");
		e1.setLname("saavaa");
		
		session.persist(e1);//persisting the obj
		t.commit();//transaction is committed
		session.close();
	}

}
