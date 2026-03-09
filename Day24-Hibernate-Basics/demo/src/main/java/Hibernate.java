import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.demo.Student;

public class Hibernate {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setRollNo(1);	
		st1.setName("Doni");
		st1.setAge(21);
		System.out.println(st1);

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.persist(st1);

		transaction.commit();
		session.close();
	} 

}
