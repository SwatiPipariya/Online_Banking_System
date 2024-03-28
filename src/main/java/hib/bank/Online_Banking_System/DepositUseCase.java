package hib.bank.Online_Banking_System;

import java.util.Scanner;

public class DepositUseCase {
	public static void main(String[] args) {
		
		AccountDao dao=new AccountDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number");
		int ano=sc.nextInt();
		Account acc= dao.findAccount(ano);
		if(acc == null)
		System.out.println("Account does not exist..");
		else{
		System.out.println("Enter the Amount to Deposit");
		int amt=sc.nextInt();
		acc.setBalance(acc.getBalance()+amt);
		boolean f1 =dao.updateAccount(acc);
		if(f1)
		System.out.println("Deposited Sucessfully...");
		else
		System.out.println("Technical Error .....");
		}
	}
}
