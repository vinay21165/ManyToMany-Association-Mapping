package org.jpa.manytoone.entity;

import javax.persistence.*;
import java.util.*;
import org.jpa.manytoone.entity.AnswerData;

public class FindAnswerByQuestionId {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("SELECT a FROM AnswerData a WHERE a.question.id=?1");
        q.setParameter(1, 1);

        List<AnswerData> list = q.getResultList();

        if (list.size() > 0) {
            for (AnswerData a : list) {
                System.out.println(a);
            }
        } else {
            System.out.println("No AnswerData found for the given id");
        }
    }
}