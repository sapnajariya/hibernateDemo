package in.com.rays.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Criteria crit=session.createCriteria(User.class);
		
		crit.add(Restrictions.like("fname","vijay"));
		crit.add(Restrictions.eq("id", 5));
		List<User> l=crit.list();
		Iterator<User> i=l.iterator();
		
		while(i.hasNext()) {
			 User u=(User)i.next();
			 
			 System.out.print("\t"+u.getId());	
			 System.out.print("\t"+u.getFname());	
			/*
			 * System.out.print("\t"+u.getLname()); System.out.print("\t"+u.getUserName());
			 * System.out.print("\t"+u.getPassword());
			 */	
			
		}
		
		

	

}
}
