package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindBatchByStudentId {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("select s.batches from Student s where s.id=?1");
        q.setParameter(1, 2);

        System.out.println(q.getResultList());
    }
}