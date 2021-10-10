package bankAccount;

/**
A bank account has a balance that can be changed by deposits, 
withdrawals, transfers, and interests. 
*/
public class BankAccount {

	private double balance;
	
	private int accountNum;
	private String accountName;
	private boolean overDrawn;
	/**
	 Constructs a bank account with a zero balance
	 */
	public BankAccount() {
		balance=0;
		
	}
	BankAccount(String name, int accountNum, double initialBal, boolean overDrawn){
		accountName = name;
		this.accountNum = accountNum;
		balance = initialBal;
		this.overDrawn = overDrawn;
	}
	
	/**
	 Constructs a bank account with a given balance
	 @param initialBalance the initial balance
	 */
	public BankAccount(double initialBalance) {
		balance=initialBalance;
	}
	
	/**
	 Deposits money into the bank account.
	 @param amount the amount to deposit
	 */
	
	
	public void deposit (double amount) {
		
		balance=balance+amount;
		if(balance > 0) {
			
			overDrawn = false;
		}
	}
	
	/**
	 Withdraws money from the bank account.
	 @param amount the amount to withdraw.
	 */
	public void withdraw (double amount) {
		if(balance >= amount) {
			balance=balance-amount;	
		}
		
		else {
			System.out.println("Negative amount!");
			overDrawn = true;
		}
		
	}
	public void transfer(double amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
	}
	public void addInterest() {
		balance = (balance*0.035) + balance;
	}
	
	public void tostring()
	{
		
		System.out.print("The Account Number is " + accountNum + " is owned by "+ accountName + " with a Balance " + balance);
		if(overDrawn == true)
		System.out.println(" It is overDrawn");
		else {
			System.out.println(" It is not overDrawn");
		}
	}
	/**
	 Gets the current balance of the bank account.
	 @return the current balance
	 */
	public double getBalance() {
		return balance;
	
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum){
		
		this.accountNum = accountNum;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String name){
		accountName = name;
	}
	
	
	public boolean isOverDrawn() {
		return overDrawn;
	}
	public void setOverDrawn(boolean status) {
		
	}
}


