package relationships;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOTMDelete {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Department  dep = (Department)session.get(Department.class, new Integer(104));
				System.out.println("Dep ID: "+dep.getDid());
				System.out.println("Dep name: "+dep.getDname());
						Set set = dep.getStudents();
						Iterator it = set.iterator();
						while(it.hasNext())
						{
							Student st = (Student)it.next();
							System.out.println(st.getSid()+" "+st.getSname());
						}
				System.out.println("Data is stored...");
	}

}
