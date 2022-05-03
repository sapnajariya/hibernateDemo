package in.com.rays.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCurd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testUpdate();
		testDelete();
		testGet();
		testList();

	}

	

	

	


//update data in database according to id
	 public static void testUpdate() {
	  
	  SessionFactory sf=new Configuration().configure().buildSessionFactory();
	  Session session=sf.openSession(); Transaction tx=session.beginTransaction();
	 UserBean user=new UserBean(); user.setId(1); user.setFname("sona");
	  user.setLname("sharma"); user.setUserName("sonababu");
	  user.setPassword("babusona"); session.update(user); tx.commit(); }
	 
	//delete data from database ad per given id
	  public static void testDelete() { // TODO Auto-generated method stub
	  SessionFactory sf=new Configuration().configure().buildSessionFactory();
	  Session session=sf.openSession(); Transaction tx=session.beginTransaction();
	  UserBean user=new UserBean(); user.setId(1); session.delete(user);
	  tx.commit(); session.close();
	  
	  }
	 
	//fatch data from database as pr given id
	  public static void testGet() { 
	  SessionFactory sf=new Configuration().configure().buildSessionFactory();
	  Session s=sf.openSession(); UserBean ub=(UserBean)s.get(UserBean.class, 2);
	  System.out.print("\t"+ub.getId()); System.out.print("\t"+ub.getFname());
	  System.out.print("\t"+ub.getLname());
	  System.out.print("\t"+ub.getUserName());
	  System.out.print("\t"+ub.getPassword()); s.close();
	 
	 }
	 //fatch all data from database in list
	public static void testList() {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from UserBean");
		List<UserBean> l=q.list();
		Iterator <UserBean>i=l.iterator();
		while(i.hasNext())
		{
			UserBean ub=i.next();
			System.out.print("\t"+ub.getId());
			System.out.print("\t"+ub.getFname());
			System.out.print("\t"+ub.getLname());
			System.out.print("\t"+ub.getUserName());
			System.out.print("\t"+ub.getPassword());
			
		}
		
	}





		
	}


