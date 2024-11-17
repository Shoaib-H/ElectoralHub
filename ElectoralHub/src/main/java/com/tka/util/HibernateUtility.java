package com.tka.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Candidate;

public class HibernateUtility {
	public static SessionFactory getSession() {
		Configuration cif = new Configuration();
		cif.configure();
		cif.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cif.buildSessionFactory();
		return factory;

	}
}
