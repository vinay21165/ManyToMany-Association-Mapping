package org.jpa.manytoone.entity;

import javax.persistence.*;
import org.jpa.manytoone.entity.*;

public class InsertData {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        // 🔹 Create Question (Parent)
        QuestionData q = new QuestionData();
        q.setPostedBy("Guru");
        q.setQuestion("What is Hibernate?");

        // 🔹 Create Answers (Child)
        AnswerData a1 = new AnswerData();
        a1.setAnsweredBy("Vinay");
        a1.setAnswer("Hibernate is ORM framework");
        a1.setQuestion(q);

        AnswerData a2 = new AnswerData();
        a2.setAnsweredBy("Anik");
        a2.setAnswer("Used to map Java objects with DB");
        a2.setQuestion(q);

        AnswerData a3 = new AnswerData();
        a3.setAnsweredBy("Amit");
        a3.setAnswer("Reduces JDBC code");
        a3.setQuestion(q);

        // 🔹 Save Data
        tx.begin();
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        tx.commit();

        System.out.println("Record Inserted Successfully");
    }
}