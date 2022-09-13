package com.commandDP;

public class CreditToAccount implements Transaction {

	private Account account;

	public CreditToAccount(Account account) {

		this.account = account;

	}

	@Override
	public void execute(int amount) {
		account.credit(amount);

	}

}
