package db;

import models.MysticalCreature;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import java.util.List;

public class DBMysticalCreature {
	private static Session session;
	private static Transaction transaction;

	public static List<MysticalCreature> orderByScariness(){
		session = HibernateUtil.getSessionFactory().openSession();
		List<MysticalCreature> scaryThings = null;
		try {
			Criteria cr = session.createCriteria(MysticalCreature.class);
			cr.addOrder(Order.desc("attackPoints"));
			scaryThings = cr.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return scaryThings;
	}



}
