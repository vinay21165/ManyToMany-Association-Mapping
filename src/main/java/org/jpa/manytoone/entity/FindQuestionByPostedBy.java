package org.jpa.manytoone.entity;

import javax.persistence.*;
import java.util.*;
import org.jpa.manytoone.entity.QuestionData;

public class FindQuestionByPostedBy {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("SELECT ques FROM QuestionData ques WHERE ques.postedBy=?1");
        q.setParameter(1, "Guru");

        List<QuestionData> list = q.getResultList();

        for (QuestionData qs : list) {
            System.out.println(qs.getQuestion());
        }
    }
}