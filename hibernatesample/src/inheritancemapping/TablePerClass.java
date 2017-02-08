package inheritancemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerClass {
	public static void main(String[] args) {
		Configuration config = new Configuration();
					//config.configure();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			CreditCard cc = new CreditCard();
			   cc.setPid(143);
			   cc.setAmount(50000);
			   cc.setCreditCard("Visa");
			   
			   Cheque cq  = new Cheque();
			   cq.setPid(123);
			   cq.setAmount(25000);
			   cq.setCheque("ICICI");
			   
			   Transaction tr = session.beginTransaction();
			   	session.save(cc);
			   	session.save(cq);
			   	
			   	tr.commit();
			
	}
}
