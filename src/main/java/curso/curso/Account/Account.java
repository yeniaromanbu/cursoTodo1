package curso.curso.Account;

import curso.curso.Transaction.Transaction;

public abstract class Account {

	private String user;
	private String numberAccount;
	private String type;
	private double balanceAccount;

	public Account(String user, String numberAccount, String type,  double balanceAccount) {
		this.user = user;
		this.numberAccount = numberAccount;
		this.type=type;
		this.balanceAccount = balanceAccount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalanceAccount() {
		return balanceAccount;
	}

	public void setBalanceAccount(double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}

	public abstract void transactionExecute(Transaction transaction);

	public String tipoCuenta() {
		return "Tipo Cuenta (Clase Padre)";
	}

}
