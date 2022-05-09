package in.com.rays.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sf=new Configuration().configure().buildSessionFactory();
Session session=sf.openSession();
User user=(User)session.get(User.class,2);//db
System.out.println(user.getFname());
System.out.println(user.getLname());
System.out.println(user.getUserName());
System.out.println(user.getPassword());
session.close();

//session.close();
Session session1=sf.openSession();
User user1=(User)session1.get(User.class,2);//first level cache
System.out.println(user1.getFname());
System.out.println(user1.getLname());
System.out.println(user1.getUserName());
System.out.println(user1.getPassword());


session1.close();

	}

}
