package in.com.rays.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("select u.id,u.fname from User u");
		/*
		 * List l=q.list(); Iterator i=l.iterator(); while(i.hasNext()) { int
		 * i1=(int)i.next(); System.out.println(i1); } }
		 */
	List l=q.list();
	Iterator i=l.iterator();
while(i.hasNext())
{
Object[] o=(Object[])i.next();
System.out.println(o[0]);
System.out.println(o[1]);
}
}
}
