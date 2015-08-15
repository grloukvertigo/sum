import java.util.*;

public class Main {

	public static void main(String[] args) {
		TreeSet<BankAccount> treeSet = new TreeSet<BankAccount>();
		
		BankAccount BA1 = new BankAccount("XXZ101", 1000);
		BankAccount BA2 = new BankAccount("XXZ103", 500);
		BankAccount BA3 = new BankAccount("XXZ105", 1500);
		
		treeSet.add(BA1);
		treeSet.add(BA2);
		treeSet.add(BA3);
		
		Iterator<BankAccount> itr = treeSet.iterator();
		while(itr.hasNext()) {
			BankAccount account = itr.next();
			System.out.println(account.getCode() + ", " + account.getBalance());
		}
	}
}

class BankAccount implements Comparable {
	
	private String code;
	private double balance;
	
	public int compareTo(Object other) {
		
		BankAccount otherAccount = (BankAccount)other;
		
		if(balance < otherAccount.balance)
			return -1;
		else if(balance > otherAccount.balance)
			return 1;
		else
			return 0;
		
		
	}
	
	public BankAccount(String aCode, double aBalance) {
	    code = aCode;
	    balance = aBalance;
	}

	public String getCode() {
		return code;
	}

	public double getBalance() {
		return balance;
	}
}
