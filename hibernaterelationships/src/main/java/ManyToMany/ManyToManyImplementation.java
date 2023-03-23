package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyImplementation {
	public static void main(String args[]) {
		
		Laptop lt = new Laptop();
		lt.setLid(10);
		lt.setLname("hp");
		
		
		Student st = new Student();
		st.setMarks(80);
		st.setRollno(1);
		st.setSname("Anita");
		st.getLaptop().add(lt);
		
		lt.getStudent().add(st);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).configure();

		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		session.save(st);
		
		session.save(lt);
		
		
		
		tr.commit();
		
		
	}

}
