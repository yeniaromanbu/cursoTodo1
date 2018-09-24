package curso.curso.Account;

import curso.curso.Transaction.Transaction;

public class CheckingAccount extends Account {

	private static final double QUOTA_MANAGEMENT = 5000;
	

	public CheckingAccount(String user, String numberAccount, String type, double balanceAccount) {
		super(user, numberAccount, type, balanceAccount);
	}

	@Override
	public void transactionExecute(Transaction transaction) {
		// Se cobra el 3% por transacción	
		super.setBalanceAccount((QUOTA_MANAGEMENT*3)/100);

	}

}
