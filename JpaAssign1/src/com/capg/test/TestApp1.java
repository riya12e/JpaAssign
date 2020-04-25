package com.capg.test;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.capg.jpaapps.Author1;


	public class TestApp1{

		public static void main(String[] args) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("JpaApp2");  
		        EntityManager em=emf.createEntityManager();  
		          
		       em.getTransaction().begin();  
		          
		        Author1 s1=new Author1();  
		        s1.setAuthorId(101);  
		        s1.setFirstName("Shivi");  
		        s1.setMiddleName("Pratap"); 
		        s1.setLastName("Pal");
		        s1.setPhoneNo("9450330984");
		        
		        Author1 s2=new Author1();  
		        s2.setAuthorId(102);  
		        s2.setFirstName("Raju");  
		        s2.setMiddleName("Kumar"); 
		        s2.setLastName("Srivastava");
		        s2.setPhoneNo("834568392");
		        
		        em.persist(s1);
		        em.persist(s2);
		       
		        em.getTransaction().commit();  
		          
		      
		       
		          
		        
		}
	}


