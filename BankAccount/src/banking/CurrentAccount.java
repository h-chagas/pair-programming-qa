package banking;

class CurrentAccount extends BankAccount {
	static int overdraftLimit = 1000;
	
	//constructor
	CurrentAccount(String name, double balance) {
		super(name, balance);
		
	}
	
	public void withdraw(double amount) {
		if (amount > balance + overdraftLimit) {
			System.out.println("You cannot withdraw more than your overdraft limit and balance");
		} else {
			this.balance -= amount;
		}
	}
}
