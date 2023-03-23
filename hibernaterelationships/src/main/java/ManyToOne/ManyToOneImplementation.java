package ManyToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneImplementation {
	public static void main(String args[]) {
//		transient state of obj
		Laptop lt = new Laptop();
		lt.setLid(11);
		lt.setLname("hp");
		
		Student st = new Student();
		st.setMarks(80);
		st.setRollno(2);
		st.setSname("Anita");
		st.getLaptop().add(lt);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).configure();

		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
//		persistent state of obj	
 
		session.save(st);
		session.save(lt);
		
		
		
		tr.commit();
//	detached state of obj	
		session.close();
		
	}

}
