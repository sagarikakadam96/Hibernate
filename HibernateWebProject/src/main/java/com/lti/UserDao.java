package com.lti;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
	public static int register(User u) {
		int i = 0;
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		if (!transaction.isActive()) {
			transaction.begin();
		}

		i = (Integer) session.save(u);
		transaction.commit();
		session.close();
		return i;
	}
}
