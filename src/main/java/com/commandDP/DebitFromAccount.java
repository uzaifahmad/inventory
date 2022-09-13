package com.commandDP;

public class DebitFromAccount implements Transaction {

	private Account account;

	public DebitFromAccount(Account account) {
		this.account = account;

	}

	@Override
	public void execute(int amount) {
		account.debit(amount);

	}

}
