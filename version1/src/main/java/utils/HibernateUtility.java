package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

	public static SessionFactory factory;

	/**
	 * Disallow to create objects from other class
	 */
	private HibernateUtility() {
	}

	/**
	 * This method is synchronized because in case of two threads calls this
	 * class at the same time, then there is a chance of creating two
	 * SessionFactory objects.
	 */
	public static synchronized SessionFactory getSessionFactory() {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}