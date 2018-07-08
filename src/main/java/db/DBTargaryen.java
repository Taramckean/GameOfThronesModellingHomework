package db;

import models.Dragon;
import models.Targaryen;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBTargaryen {
	private static Session session;

	public static List<Dragon> getDragonsForTargaryen(Targaryen targaryen) {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Dragon> results = null;
		try {
			Criteria cr = session.createCriteria(Dragon.class);
			cr.add(Restrictions.eq("targaryen", targaryen));
			results =  cr.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return results;
	}
}
