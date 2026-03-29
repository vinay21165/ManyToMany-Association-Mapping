package org.jpa.manytoone.entity;

import javax.persistence.*;
import org.jpa.manytoone.entity.QuestionData;

public class FindQuestionByAnswerId {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("SELECT a.question FROM AnswerData a WHERE a.id=?1");
        q.setParameter(1, 1);

        try {
            QuestionData qs = (QuestionData) q.getSingleResult();
            System.out.println(qs);
        } catch (NoResultException e) {
            System.out.println("No AnswerData Found For id");
        }
    }
}