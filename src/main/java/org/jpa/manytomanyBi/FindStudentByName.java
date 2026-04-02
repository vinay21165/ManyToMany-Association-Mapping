package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindStudentByName {
    public static void main(String[] args) {

    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
         EntityManager em=emf.createEntityManager();

        Query q = em.createQuery("select s from Student s where s.name=?1");
        q.setParameter(1, "Anik");

        System.out.println(q.getResultList());
    }
}