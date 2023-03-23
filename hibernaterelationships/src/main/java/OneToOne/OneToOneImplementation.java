package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneImplementation {
	public static void main(String args[]) {
		
//		have used friends table in mysql bench
//		
//		Laptop lt = new Laptop();
//		lt.setLid(10);
//		lt.setLname("hp");
//		 
//		Student st = new Student();
//		st.setMarks(80);
//		st.setRollno(1);
//		st.setSname("Anita");
//		st.setLaptop(lt);
		
		Laptop lt2 =new Laptop();
		lt2.setLid(11);
		lt2.setLname("lenovo");
		
		Student st2 = new Student();
		st2.setMarks(70);
		st2.setRollno(2);
		st2.setSname("Renu");
		st2.setLaptop(lt2);
		
//		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).configure();
		Configuration con = new Configuration().configure();
		

		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
//		session.save(st);
//		
//		session.save(lt);
		
		session.save(st2);
		session.save(lt2);
		
		Student st= (Student) session.get(Student.class, 2);
		System.out.println(st.getSname());
		System.out.println(st.getLaptop().getLname());
		
		
		tr.commit();
		
		
	}

}
