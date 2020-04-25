package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpaapps.Author1;

public class TestUpdate {
   
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JpaApp2");  
	        EntityManager em=emf.createEntityManager();  
	          
	       em.getTransaction().begin();  
	       
	        Author1 s=em.find(Author1.class,101);  
	        System.out.println("Before Updation");  
	        System.out.println("Author id = "+s.getAuthorId());  
	        System.out.println("Author First Name = "+s.getFirstName());  
	        System.out.println("Author Middle Name  = "+s.getMiddleName());
	        System.out.println("Author Last Name  = "+s.getLastName());
	        System.out.println("Author Phone Number  = "+s.getPhoneNo());
	        
	          
	        s.setFirstName("Sheelu");
	        s.setPhoneNo("87883458");
	          
	        System.out.println("After Updation");
	        System.out.println("Author id = "+s.getAuthorId());  
	        System.out.println("Author First Name = "+s.getFirstName());  
	        System.out.println("Author Middle Name  = "+s.getMiddleName());
	        System.out.println("Author Last Name  = "+s.getLastName());
	        System.out.println("Author Phone Number  = "+s.getPhoneNo());
	        
	          
	          
	          
	       
	       
	   
	          
	      
	       
	          
	        
	}
}


