package OneToOne2ndExe;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneImplementation {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Office o1 = new Office();
		o1.setOfficeLocation("Bangalore");
		o1.setoId(10);
		
		e1.seteAge(23);
		e1.seteDept("HR");
		e1.seteId(1);
		e1.seteName("Anita");
		e1.setOffice(o1);
		
		
		Employee e2 = new Employee();
		Office o2 = new Office();
		o2.setOfficeLocation("Bombay");
		o2.setoId(11);
		
		e2.seteAge(23);
		e2.seteDept("Marketing");
		e2.seteId(2);
		e2.seteName("Gouri");
		e2.setOffice(o2);
		
		Employee e3 = new Employee();
		Office o3 = new Office();
		o3.setOfficeLocation("Mangalore");
		o3.setoId(12);
		
		e3.seteAge(23);
		e3.seteDept("Finance");
		e3.seteId(3);
		e3.seteName("Renu");
		e3.setOffice(o3);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Office.class).configure();
		
		SessionFactory ssf = con.buildSessionFactory();
		
		Session sn = ssf.openSession();
		
		
		Transaction tr = sn.beginTransaction();
		
		sn.save(e1);
		sn.save(o1);
		
		tr.commit();
	}

}
