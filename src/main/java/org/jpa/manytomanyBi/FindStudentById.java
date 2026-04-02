package org.jpa.manytomanyBi;
import javax.persistence.*;

public class FindStudentById {
    public static void main(String[] args) {

    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
       	EntityManager em=emf.createEntityManager();

        Student s = em.find(Student.class, 1);
        System.out.println(s);
    }
}