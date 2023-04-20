package banking;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;
	
	//constructor
	CurrentAccount(String name, double balance) {
		super(name, balance);
		overdraftLimit = 1000;
	}
	
	public void withdraw(double amount) {
		if (amount > this.balance + this.overdraftLimit) {
			System.out.println("You cannot withdraw more than your overdraft limit and balance");
		} else {
			this.balance -= amount;
		}
	}
}
