package org.jpa.manytoone.entity;

import javax.persistence.*;
import java.util.*;
import org.jpa.manytoone.entity.AnswerData;

public class FindAnswerByAnswer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Answer:");
        String ans = sc.nextLine();

        EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

        Query q = em.createQuery("SELECT a FROM AnswerData a WHERE a.answer=?1");
        q.setParameter(1, ans);

        try {
            AnswerData ad = (AnswerData) q.getSingleResult();
            System.out.println(ad);
        } catch (NoResultException e) {
            System.out.println("No AnswerData Found");
        }
    }
}