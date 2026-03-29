package org.jpa.manytoone.entity;

import javax.persistence.*;
import java.util.*;
import org.jpa.manytoone.entity.AnswerData;

public class FindAnswerByPostedBy {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery(
            "SELECT a FROM AnswerData a WHERE a.question.postedBy=?1"
        );

        q.setParameter(1, "Guru");

        List<AnswerData> list = q.getResultList();

        for (AnswerData a : list) {
            System.out.println(a);
        }
    }
}