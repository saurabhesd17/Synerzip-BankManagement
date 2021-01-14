import java.util.Scanner;

public class Account {
	private static int accountNumber = 1001;
}

class savingsAccount extends Account {
	private double balance;
	private double interestRate;
	private final double transactionLimit = 50000.00;
	private final double minimumBalance = 1000.00;
	private final double maximumTransactionAmount = 10000.00;
	private final String accountType = "Savings";
	private String accountStatus = "Active";

	public void createNewSavingsAccount() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Balance: ");
		balance = getData.nextDouble();
		System.out.print("\nEnter Interest Rate: ");
		interestRate = getData.nextDouble();
		getData.close();
	}
}

class currentAccount extends Account {
	private double balance;
	private final String accountType = "Current";
	private String accountStatus = "Active";

	void createNewCurrentAccount() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Balance: ");
		balance = getData.nextDouble();
		getData.close();
	}
}