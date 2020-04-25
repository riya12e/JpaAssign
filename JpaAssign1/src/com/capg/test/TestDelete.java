package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpaapps.Author1;

public class TestDelete {
      public static void main(String args[]){
    	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("JpaApp2");  
    	    EntityManager em=emf.createEntityManager();  
    	    em.getTransaction().begin();  
    	  
    	    Author1 s=em.find(Author1.class,102);  
    	    em.remove(s);  
    	    em.getTransaction().commit(); 
      }
}
