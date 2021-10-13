package bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub



		BankAccount harrysChecking = new BankAccount("Harry", 12345, 0.00, false);
		System.out.println(harrysChecking);
		harrysChecking.deposit(200);
		System.out.println("Checking " + harrysChecking.getBalance() + harrysChecking.overDrawnStatus());
		harrysChecking.withdraw(500);	
		System.out.print("Checking " +harrysChecking.getBalance());
		System.out.println(harrysChecking.overDrawnStatus());
		harrysChecking.deposit(400);
		System.out.print("Checking " +harrysChecking.getBalance());
		System.out.println(harrysChecking.overDrawnStatus());

		BankAccount harrysSavings = new BankAccount("Harry", 86754, 500.00, false);
		System.out.println(harrysSavings);
		harrysSavings.transfer(50, harrysChecking);
		System.out.print("Savings " +harrysSavings.getBalance());
		System.out.println(harrysChecking.overDrawnStatus());
		System.out.print("Checking " +harrysChecking.getBalance());
		System.out.println(harrysChecking.overDrawnStatus());
		harrysSavings.addInterest();
		System.out.print("Savings " +harrysSavings.getBalance());
		System.out.print(harrysChecking.overDrawnStatus());


		}



		


}
