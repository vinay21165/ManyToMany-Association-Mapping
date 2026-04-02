package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindStudentsByBatchId {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("select b.students from Batch b where b.id=?1");
        q.setParameter(1, 1);

        System.out.println(q.getResultList());
    }
}