package in.com.rays.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Criteria crit=session.createCriteria(User.class);
		ProjectionList projlist=Projections.projectionList();
		projlist.add(Projections.property("fname"));
		crit.add(Restrictions.like("lname", "sharma"));
		crit.setProjection(projlist);
		List l=crit.list();
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			String name=(String)i.next();
			System.out.print(name);
		}
		
				
		

	}

}
