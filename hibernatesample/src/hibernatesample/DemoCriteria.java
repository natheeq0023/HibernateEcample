package hibernatesample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class DemoCriteria {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
					//cfg.configure("hibernate.cfg.xml");
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
				StudentData s = new StudentData();
						//s.setSid(125);
						s.setSname("Kerna");
						s.setMarks("600");
						
					ss.save(s);
		
		
		
		
		
		
		tr.commit();
		
		
		
	//	Criteria cry = ss.createCriteria(StudentData.class);
		/*cry.setFirstResult(3);
		cry.setMaxResults(8);*/
		/*cry.addOrder(Order.asc("marks"));*/
/*		cry.add(Restrictions.gt("marks", "500"));*/
		
		/*cry.setProjection(Projections.property("sname"));
		
		List l = cry.list();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			StudentData ob = (StudentData) itr.next();
			System.out.println(ob.getSid()+" | "+ob.getTm()+" | "+ob.getSname()+" | "+ob.getMarks());
			System.out.println(itr.next());
		}*/
		ss.close();
		sf.close();
	}
}
