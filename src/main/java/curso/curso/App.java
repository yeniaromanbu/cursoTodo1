package curso.curso;

import java.util.ArrayList;

import curso.curso.Account.Account;
import curso.curso.Account.CheckingAccount;
import curso.curso.Account.KidsSavingAccount;
import curso.curso.Account.SavingAccount;

/**
 * Hello world!
 *
 */
public class App {

	public static ArrayList<Account> accountList = new ArrayList<Account>();

	public static void main(String[] args) {

		CheckingAccount checkingAccount = new CheckingAccount("user01", "465421654216", "CheckingAccount", 3000);
		KidsSavingAccount kidsSavingAccount = new KidsSavingAccount("user02", "000054421540", "KidsSavingAccount", 4000);
		SavingAccount savingAccount = new SavingAccount("user03", "4845324105645", "SavingAccount", 80000);
		
		accountList.add(checkingAccount);
		accountList.add(kidsSavingAccount);
		accountList.add(savingAccount);

		System.out.println("Account Type: ");		
		for (Account accountType : accountList) {
			System.out.println(accountType.getType());
			
		}
		
		

	}
}
