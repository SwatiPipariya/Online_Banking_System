package hib.bank.Online_Banking_System;

public interface AccountDao {
	
	public boolean createAccount(Account account);
	
	public boolean deleteAccount(int accno);
	
	public boolean updateAccount(Account account);
	
//	public boolean updateAccount(int i);
	
	public Account findAccount(int accno);

//	boolean updateAccount(int i);
}
