package org.jpa.manytomanyBi;

import javax.persistence.*;

public class FindBatchById {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

        Batch b = em.find(Batch.class, 1);

        if (b != null) {
            System.out.println(b.getBatch_code());
            System.out.println(b.getSubject());
        } else {
            System.out.println("Batch not found");
        }

        em.close();
        emf.close();
    }
}