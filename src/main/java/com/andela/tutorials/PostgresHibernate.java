package com.andela.tutorials;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.andela.tutorials.entity.User;

public class PostgresHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure(
				"hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user = new User();
		user.setCompany("Andela");
		user.setEmail("jumoke@andlea.co");
		user.setFullName("Jumoke");

		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
