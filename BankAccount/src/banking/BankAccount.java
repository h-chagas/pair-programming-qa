package banking;

public class BankAccount {
	
	//properties
	private String name;
	private int accountNumber;
	private double balance;
	
	//class variable
	static int id = 100_000;
	
	//constructor
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.accountNumber = ++id;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	
	public int accountNumber() {
		return this.accountNumber;
	}
	
	public double balance() {
		return this.balance;
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	//no need to set accountNumber (automatic generated)
	//no need to set balance (overwrite current balance)
	
	
	//methods
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("You don't have enough money to withdraw");
		} else {
			this.balance -= amount;
		}
	}
	

	
	
	
	
	

}
