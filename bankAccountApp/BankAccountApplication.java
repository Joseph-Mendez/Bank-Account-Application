package bankAccountApp;

public class BankAccountApplication {

	public static void main(String[] args) {
		
		Checking cheacc1 = new Checking("Joseph Mendez", "123456789", 1500);
		Savings savacc1 = new Savings("Joseph Mendez", "987654321", 9000);
		
		savacc1.showInfo();
		System.out.println("************");
		chkacc1.showInfo();

	}

}
