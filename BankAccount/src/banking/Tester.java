package banking;

public class Tester {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Lupin", 100);
		BankAccount b2 = new BankAccount("Philomena", 100_000);
		System.out.println(b1.accountNumber() + " " + b1.getName() + " " + b1.balance());
		System.out.println(b2.accountNumber() + " " + b2.getName() + " " + b2.balance());
		
		b1.deposit(100);
		System.out.println("Hi " + b1.getName() + ", your balance is " + b1.balance());
		
		b2.deposit(4_000);
		System.out.println("Hi " + b2.getName() + ", your balance is " + b2.balance());
		
		CurrentAccount c1 = new CurrentAccount("Jake", 5);
		c1.withdraw(1005);
		System.out.println(c1.balance());
		
		SavingsAccount s1 = new SavingsAccount("Paul", 10);
		s1.AddInterest();


		
	}



}
