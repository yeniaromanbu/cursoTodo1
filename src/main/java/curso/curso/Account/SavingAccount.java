package curso.curso.Account;

import curso.curso.Transaction.Transaction;

public class SavingAccount extends Account {

	private static final double CUOTA_MANEJO = 2000;
	private int numberTransaction = 0;

	public SavingAccount(String user, String numberAccount, String type, double balanceAccount) {
		super(user, numberAccount, type, balanceAccount);

	}

	@Override
	public void transactionExecute(Transaction transaction) {
		// TODO Auto-generated method stub
		if (numberTransaction++ >= 3) {
			double totalBalance = super.getBalanceAccount() - (transaction.getvalueTransaction() * 0.05);
			super.setBalanceAccount(totalBalance);
		}

	}

}
