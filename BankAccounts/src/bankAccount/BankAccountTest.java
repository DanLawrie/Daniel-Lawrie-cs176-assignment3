package bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub



		BankAccount harrysChecking = new BankAccount("Harry", 12345, 0.00, false);
		harrysChecking.tostring();
		harrysChecking.deposit(200);
		System.out.println(harrysChecking.getBalance());
		harrysChecking.withdraw(500);
		System.out.println(harrysChecking.getBalance());
		harrysChecking.deposit(400);
		System.out.println(harrysChecking.getBalance());


		BankAccount harrysSavings = new BankAccount("Harry", 86754, 500.00, false);
		harrysSavings.tostring();
		harrysSavings.transfer(50, harrysChecking);
		System.out.println(harrysSavings.getBalance());
		System.out.println(harrysChecking.getBalance());
		harrysSavings.addInterest();
		System.out.println(harrysSavings.getBalance());


		}



		


}
