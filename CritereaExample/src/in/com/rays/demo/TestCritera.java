package in.com.rays.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCritera {

	public static void main(String[] args) {
		testCriteria();
	}
		
		private static void testCriteria() {
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(User.class);
			List<User> l=cr.list();
			Iterator<User> it=l.iterator();
			while(it.hasNext())
			{
				User user=(User)it.next();
				System.out.print("\t"+user.getId());
				System.out.print("\t"+user.getFname());
				System.out.print("\t"+user.getLname());
				System.out.print("\t"+user.getUserName());
				System.out.println("\t"+user.getPassword());
			}
		// TODO Auto-generated method stub
		
	}

		

	}


