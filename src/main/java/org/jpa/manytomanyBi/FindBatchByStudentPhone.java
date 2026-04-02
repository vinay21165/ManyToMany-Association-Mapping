package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindBatchByStudentPhone {
    public static void main(String[] args) {

    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
     	EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select s.batches from Student s where s.phone=?1");
        q.setParameter(1, 9876543211L);

        System.out.println(q.getResultList());
    }
}