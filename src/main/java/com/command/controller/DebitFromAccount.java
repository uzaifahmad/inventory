package com.command.controller;

import com.command.receiver.Account;

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
