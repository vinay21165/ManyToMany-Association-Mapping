package org.jpa.manytoone.entity;

import javax.persistence.*;
import java.util.*;
import org.jpa.manytoone.entity.QuestionData;

public class FindQuestionByQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Question:");
        String que = sc.nextLine();

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("SELECT ques FROM QuestionData ques WHERE ques.question=?1");
        q.setParameter(1, que);

        try {
            QuestionData qe = (QuestionData) q.getSingleResult();
            System.out.println(qe);
        } catch (NoResultException e) {
            System.out.println("No Data found with respect to this question");
        }
    }
}