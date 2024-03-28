package hib.bank.Online_Banking_System;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("BankUnit");
    }

    public static EntityManager provideEntityManager() {
        return emf.createEntityManager();
    }

    public static void addAccount(Account account) {
        EntityManager entityManager = provideEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(account);
            entityManager.getTransaction().commit();
            System.out.println("Account created successfully");
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}














//package hib.bank.Online_Banking_System;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class EMUtil {
//	private static EntityManagerFactory emf;
//	static{
//	emf=Persistence.createEntityManagerFactory("BankUnit");
//	}
//	public static EntityManager provideEntityManager(){
//	//EntityManager em= emf.createEntityManager();
//	//return em;
//	return emf.createEntityManager();
//	
//	
//
//}
//	
//}
