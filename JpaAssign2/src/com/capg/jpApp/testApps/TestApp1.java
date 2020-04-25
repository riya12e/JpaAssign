package com.capg.jpApp.testApps;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	import com.capg.jpApp.entities.Author2;
	import com.capg.jpApp.entities.Book;

	public class TestApp1 {
	public static void main(String[] args) {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyProject2");
			
			EntityManager manager = factory.createEntityManager();
			
			Author2 a1=new Author2(1,"Riya Singh");
			Author2 a2=new Author2(2,"Jyoti Pathak");
			Book b1=new Book(3,"Rajeev",101,"Jungle Book",500);
			Book b2=new Book(4,"Shailza",102,"Harry Potter",2000);
			manager.getTransaction().begin();
			manager.persist(a1);
			manager.persist(a2);
			manager.persist(b1);
			
			manager.getTransaction().commit();
			
			System.out.println("data stored in db.");
			factory.close();
			

	}
	}

