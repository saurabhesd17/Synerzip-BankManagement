import java.util.Scanner;

public class SavingsAccount extends Account {
	enum type{
		ACTIVE,
		DORMANT;
	}
	
	private double balance;//put in account class
	private double interestRate;//make as final
	private final static double monthlyLimit = 50000.00;
	private final static double minimumBalance = 1000.00;
	private final static double dailyTransactionAmount = 10000.00;
	private String accountStatus = String.valueOf(type.ACTIVE);//create a separate class for enum
	
	public void createNewAccount() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Balance: ");
		balance = getData.nextDouble();
		System.out.print("\nEnter Interest Rate: ");
		interestRate = getData.nextDouble();
		getData.close();
	}
	
	public void showAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate);
		System.out.println("Account Status: " + accountStatus);
		System.out.println("Maximum Transaction Amount Per Month: " + monthlyLimit);
		System.out.println("Minimum Balance Required in Account: " + minimumBalance);
		System.out.println("Maximum Amount Per Day: " + dailyTransactionAmount);
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public double getMonthlyLimit() {
		return monthlyLimit;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public double getDailyTransactionAmount() {
		return dailyTransactionAmount;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
}