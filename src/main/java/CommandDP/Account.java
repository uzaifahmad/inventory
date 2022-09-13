package CommandDP;

public class Account {

	private String name;
	private int balance;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public void credit(int amount) {
		balance += amount;
		System.out.println("Name: " + name + " Amount: " + amount + " Credited \nBalance: " + balance);
	}

	public void debit(int amount) {
		balance -= amount;
		System.out.println("Name: " + name + " Amount: " + amount + " Debited\nBalance: " + balance);
	}

}
