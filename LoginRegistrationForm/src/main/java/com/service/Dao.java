package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.entities.User;
import com.helper.ConnectionProvider;

public class Dao {
	SessionFactory factory;
	Session session;

	public User getUser(String email) {
		User u = null;

		factory = ConnectionProvider.createFactory();
		session = factory.openSession();

		u = (User) session.get(User.class, email.trim());

		return u;
	}

	public boolean saveUser(User u) {

		boolean isSave = false;
		try {

			factory = ConnectionProvider.createFactory();

			session = factory.openSession();

			Transaction tr = session.beginTransaction();

			session.persist(u);
			tr.commit();

			session.close();

			isSave = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (isSave) {
			return true;
		}
		return false;
	}
}
