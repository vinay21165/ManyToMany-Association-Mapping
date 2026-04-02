package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindBatchByCode {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("select b from Batch b where b.batch_code=?1");
        q.setParameter(1, "JFT-BGT-A11");

        System.out.println(q.getSingleResult());
    }
}