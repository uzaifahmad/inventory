package CommandDP;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	public void addTransaction(Transaction transaction) {

		transactions.add(transaction);

	}

	public void executeTransaction(int amount) {

		for (Transaction transaction : transactions) {
			transaction.execute(amount);
		}
		transactions.clear();
	}

}
