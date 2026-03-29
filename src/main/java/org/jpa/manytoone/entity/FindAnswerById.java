package org.jpa.manytoone.entity;

import javax.persistence.*;
import org.jpa.manytoone.entity.AnswerData;

public class FindAnswerById {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        AnswerData a = em.find(AnswerData.class, 1);

        if (a != null) {
            System.out.println(a);
        } else {
            System.out.println("No Answer Found");
        }
    }
}