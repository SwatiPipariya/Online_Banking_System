package hib.bank.Online_Banking_System;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        // Create EntityManager
        EntityManager entityManager = EMUtil.provideEntityManager();

        // Create AccountDaoImpl instance
        AccountDaoImpl accountDao = new AccountDaoImpl();

        // Create account object 
//        Account account = new Account(1117, "Mohit", 2300);
        Account account = new Account();

        // ******************* createAccount method **********************
//        boolean createResult = accountDao.createAccount(account);
//        if (createResult) {
//            System.out.println("Account created successfully");
//        } else {
//            System.out.println("Failed to create account");
//        }

        // ************************** deleteAccount method *********************
//        boolean deleteResult = accountDao.deleteAccount(1113);
//        if (deleteResult) {
//            System.out.println("Account deleted successfully");
//        } else {
//            System.out.println("Failed to delete account");
//        }

        // ************ updateAccount method ************************
//        Account accountToUpdate = accountDao.findAccount(1115);
//        if (accountToUpdate != null) {
//            accountToUpdate.setBalance(2500); // Update balance
//            boolean updateResult = accountDao.updateAccount(accountToUpdate);
//            if (updateResult) {
//                System.out.println("Account updated successfully");
//            } else {
//                System.out.println("Failed to update account");
//            }
//        } else {
//            System.out.println("Account with account number 1115 not found");
//        }


        // **************** findAccount method ********************
//        Account foundAccount = accountDao.findAccount(1116);
//        if (foundAccount != null) {
//            System.out.println("Found account: " + foundAccount);
//        } else {
//            System.out.println("Account not found");
//        }

//        **********************Amount Deposit Method*******************
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter Account number:");
//        int accountNumber = scanner.nextInt();
//
//        Account account1 = accountDao.findAccount(accountNumber);
//
//        if (account1 == null) {
//            System.out.println("Account does not exist.");
//        } else {
//            System.out.println("Enter the Amount to Deposit:");
//            int amountToDeposit = scanner.nextInt();
//
//            account1.setBalance(account1.getBalance() + amountToDeposit);
//
//            boolean updateResult = accountDao.updateAccount(account1);
//
//            if (updateResult) {
//                System.out.println("Deposited Successfully...");
//            } else {
//                System.out.println("Technical Error...");
//            }
//        }
//
//        scanner.close();
        
//        ***************************Withdraw Amount Method***********************
     // Create Scanner instance for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter account number
        System.out.println("Enter Account number:");
        int accountNumber = scanner.nextInt();

        // Find the account by its account number
        Account account1 = accountDao.findAccount(accountNumber);

        if (account1 == null) {
            System.out.println("Account does not exist.");
        } else {
            // Prompt user to enter the amount to withdraw
            System.out.println("Enter the withdrawing amount:");
            int amountToWithdraw = scanner.nextInt();

            // Check if there's enough balance for withdrawal
            if (amountToWithdraw <= account1.getBalance()) {
                // Update the account balance
                account1.setBalance(account1.getBalance() - amountToWithdraw);

                // Update the account in the database
                boolean updateResult = accountDao.updateAccount(account1);

                // Print appropriate message based on update result
                if (updateResult) {
                    System.out.println("Please collect the cash...");
                } else {
                    System.out.println("Technical Error...");
                }
            } else {
                System.out.println("Insufficient Amount..");
            }
        }

        // Close the Scanner
        scanner.close();
        
        
        entityManager.close();
    }
}


























//package hib.bank.Online_Banking_System;
//
//public class App {
//    public static void main(String[] args) {
//        // Create accounts
//        Account a1 = new Account(1116, "Virat", 700);
//
//        // Add accounts to the database using EMUtil
//        EMUtil.addAccount(a1);
//        
//        
//    }
//}

















































//package hib.bank.Online_Banking_System;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import com.dto.Products;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankUnit");
//		EntityManager em = emf.createEntityManager();
//        
//		System.out.println( "Hello World!" );
//        
//		//Here we are adding accounts  in database
//	   // For this we need to start transaction and commit transaction
//				
//		 		Account a1 = new Account(1113, "Cheshta", 1500);
//		 		
//				// This is our transaction where we can add, remove, update the products
//		 		
//				em.getTransaction().begin();
//				
//				em.persist(a1);
//				
//				em.getTransaction().commit();
//				
//				System.out.println("Account created successfully");
//				
//				em.close();   // This is done for closing the connection
//        
//        
//        
//    }
//}
