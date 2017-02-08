package hibernatesample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.CreateKeySecondPass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cnf = new Configuration(); 
		//cnf.configure("hibernate.cfg.xml");
		cnf.configure(); 
		SessionFactory sf = cnf.buildSessionFactory();
		Session ss = sf.openSession();
	//Object o=ss.load(StudentData.class, 111);
	
	//StudentData s=(StudentData)o;
	//System.out.println(s.getMarks());
	//System.out.println(s.getSname());
		//Transient state
		
		StudentData dt = null;
	Object ob = ss.get(StudentData.class, new Integer(123));
	//persistent state
	dt = (StudentData)ob;
	//dt.setSname("RajaRam");
		ss.close();
		//detached
		dt.setMarks("2000");
		Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			//persistent
			session.merge(dt);
			tr.commit();
		session.close();
		
		sf.close();
		//ss.save(s);
		//ss.update(s);
	
		/*Query qry = ss.createQuery("From StudentData s where s.sname='Kernal'");
		List l = qry.list();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			StudentData st =(StudentData)itr.next();
			System.out.println(st.getSid()+" "+st.getSname()+" "+st.getMarks());
		}*/
		
		/*Query qry =ss.createQuery("from StudentData s");
				List l = qry.list();
				Iterator itr = l.iterator();
				
				while (itr.hasNext()) {
					StudentData s = (StudentData) itr.next();
					System.out.println(s.getSid()+" | "+s.getTm()+" | "+s.getSname()+" | "+s.getMarks());
					
				}*/
		
		ss.close();
		sf.close();
		System.out.println("Successfully executed");
		

	}

}
