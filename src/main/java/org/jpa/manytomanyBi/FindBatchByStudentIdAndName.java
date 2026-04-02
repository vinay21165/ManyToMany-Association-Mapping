package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindBatchByStudentIdAndName {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        	EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select s.batches from Student s where s.id=?1 and s.name=?2");

        q.setParameter(1, 1);
        q.setParameter(2, "Anik");

        System.out.println(q.getResultList());
    }
}