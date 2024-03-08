package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
	private static SessionFactory factory;

	public static SessionFactory createFactory() {
		if (factory == null) {

			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		}
		return factory;
	}
}
