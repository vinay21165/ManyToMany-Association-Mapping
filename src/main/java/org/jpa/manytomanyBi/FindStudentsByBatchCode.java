package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindStudentsByBatchCode {
    public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select b.students from Batch b where b.batch_code=?1");
        q.setParameter(1, "JFT-BGT-A11");

        System.out.println(q.getResultList());
    }
}