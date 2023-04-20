package banking;

class SavingsAccount extends BankAccount {
	
	static double interestRate = 0.02;
	
	//constructor
	SavingsAccount(String name, double balance) {
		super(name, balance);
	}
	
	public void AddInterest() {
		balance += balance * interestRate;		
		System.out.println("Your Savings account's balance: " + balance());
	}
	
	
}
