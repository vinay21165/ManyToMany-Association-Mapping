package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindBatchByStudentPhoneAndName {
    public static void main(String[] args) {

    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
      	EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select s.batches from Student s where s.phone=?1 and s.name=?2");

        q.setParameter(1, 9876543211L);
        q.setParameter(2, "Anik");

        System.out.println(q.getResultList());
    }
}