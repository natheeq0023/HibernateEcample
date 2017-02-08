package relationships;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOTMInsert {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			Department dep = new Department();
				dep.setDid(101);
				dep.setDname("CSE");
						Student st1 = new Student();
								st1.setSid(501);
								st1.setSname("Smith");
						Student st2 = new Student();
								st2.setSid(502);
								st2.setSname("Marley");
						Student st3 = new Student();
								st3.setSid(503);
								st3.setSname("Kinley");
						Set set = new HashSet();
						set.add(st1);
						set.add(st2);
						set.add(st3);
				dep.setStudents(set);
			Transaction tran = session.beginTransaction();
					session.save(dep);
					tran.commit();
					System.out.println("Data is stored...");
	}
}
