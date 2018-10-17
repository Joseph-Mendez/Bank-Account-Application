package bankAccountApp;

public abstract class Account implements IBaseRate {
	
	String name;
	String sSN;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		index++;
		this.accountNumber = setAccountNumber();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
		
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance +
				"\nRATE: " + rate + "%" );

	}

}
