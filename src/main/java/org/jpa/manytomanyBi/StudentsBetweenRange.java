package org.jpa.manytomanyBi;
import javax.persistence.*;

public class StudentsBetweenRange {
    public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();


        Query q = em.createQuery("select s from Student s where s.perc between ?1 and ?2");

        q.setParameter(1, 80.0);
        q.setParameter(2, 100.0);

        System.out.println(q.getResultList());
    }
}