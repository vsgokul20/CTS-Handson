package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
public class Employee {
	SessionFactory factory;
	public Integer addEmployee(Employee employee){

		Session session = factory.openSession();

		Transaction tx = null;

		Integer employeeID = null;

		try {

		tx = session.beginTransaction();

		employeeID = (Integer) session.save(employee);

		tx.commit();

		} catch (HibernateException e) {

		if (tx != null) tx.rollback();

		e.printStackTrace();

		} finally {

		session.close();

		}

		return employeeID;

		}
}
