package service;
import model.StudentPojo;
import javax.persistence.*;

public class PersistStud {

	public static void main(String[] args) {
		
	//	Persistence p = new Persistence();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPrac");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		StudentPojo s1 = new StudentPojo();
		s1.setId(114);
		s1.setName("nurul");
		
		em.persist(s1);
		
		em.getTransaction().commit();
		em.close();

	}

}
