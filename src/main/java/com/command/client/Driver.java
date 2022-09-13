package com.command.client;

import com.command.controller.CreditToAccount;
import com.command.controller.DebitFromAccount;
import com.command.invoker.Bank;
import com.command.receiver.Account;

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
