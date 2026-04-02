package org.jpa.manytomanyBi;
import javax.persistence.*;

public class StudentsAbove60 {
    public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select s from Student s where s.perc > 60");

        System.out.println(q.getResultList());
    }
}