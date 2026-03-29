package org.jpa.manytoone.entity;

import javax.persistence.*;
import java.util.*;
import org.jpa.manytoone.entity.AnswerData;

public class FindAnswerByQuestionText {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery(
            "SELECT a FROM AnswerData a WHERE a.question.question=?1"
        );

        q.setParameter(1, "What is Hibernate?");

        List<AnswerData> list = q.getResultList();

        for (AnswerData a : list) {
            System.out.println(a);
        }
    }
}