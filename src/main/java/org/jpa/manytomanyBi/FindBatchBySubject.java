package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindBatchBySubject {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("select b from Batch b where b.Subject=?1");
        q.setParameter(1, "Java");

        System.out.println(q.getResultList());
    }
}