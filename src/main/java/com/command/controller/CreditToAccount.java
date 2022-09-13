package com.command.controller;

import com.command.receiver.Account;

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
