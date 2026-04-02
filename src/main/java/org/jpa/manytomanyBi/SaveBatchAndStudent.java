package org.jpa.manytomanyBi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBatchAndStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		
		Batch b1=new Batch();
		b1.setBatch_code("JFT-BGT-A11");
		b1.setSubject("Java");
		b1.setTrainer("Pavan Jain");
		
		Batch b2=new Batch();
		b2.setBatch_code("JFT-BGT-M16");
		b2.setSubject("Advance java");
		b2.setTrainer("Mayank");
		
		Student s1=new Student();
		s1.setName("Anik");
		s1.setPhone(9876543211l);
		s1.setPerc(98.0);
		
		Student s2=new Student();
		s2.setName("kunal");
		s2.setPhone(9876543212l);
		s2.setPerc(93.0);
		
		Student s3=new Student();
		s3.setName("Karthik");
		s3.setPhone(9876543213l);
		s3.setPerc(94.0);
		
		b1.setStudents(Arrays.asList(s1,s2,s3));
		b2.setStudents(Arrays.asList(s2,s3));
		
		s1.setBatches(Arrays.asList(b1));
		s2.setBatches(Arrays.asList(b1,b2));
		s3.setBatches(Arrays.asList(b1,b2));
		
		em.persist(b1);
		em.persist(b2);
		
		etran.commit();
		
		System.out.println("Sucessfully insert the record");
		
		
		
	}

}
