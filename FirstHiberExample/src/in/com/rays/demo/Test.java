package in.com.rays.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		testAdd();

	}

	private static void testAdd() {
		// TODO Auto-generated method stub
		User u=new User();
		u.setFname("sapna");
		u.setLname("jariya");
		u.setUserName("sapnajariya");
		u.setPassword("admin123");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
	}

}
