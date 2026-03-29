package org.jpa.manytoone.entity;

import javax.persistence.*;
import org.jpa.manytoone.entity.QuestionData;

public class FindQuestionById {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        QuestionData q = em.find(QuestionData.class, 1);

        if (q != null) {
            System.out.println(q.getQuestion());
        } else {
            System.out.println("No Data Found");
        }
    }
}