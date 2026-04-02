package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindStudentsBySubjectAndCode {
    public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select b.students from Batch b where b.Subject=?1 and b.batch_code=?2");

        q.setParameter(1, "Java");
        q.setParameter(2, "JFT-BGT-A11");

        System.out.println(q.getResultList());
    }
}