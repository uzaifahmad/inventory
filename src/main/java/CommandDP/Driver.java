package CommandDP;

public class Driver {

	public static void main(String[] args) {
		Account account = new Account("Uzaif", 1000);

		CreditToAccount c = new CreditToAccount(account);
		DebitFromAccount d = new DebitFromAccount(account);

		Bank bank = new Bank();

		bank.addTransaction(c);
		bank.executeTransaction(500);
		bank.addTransaction(d);
		bank.executeTransaction(200);

	}

}
