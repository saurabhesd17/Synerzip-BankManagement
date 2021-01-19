import java.util.Scanner;

public class CurrentAccount extends Account {
	enum type{
		ACTIVE,
		DORMANT;
	}
	
	private double balance;
	private final String accountType = "Current";
	private String accountStatus = String.valueOf(type.ACTIVE);

	public void createNewAccount() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Balance: ");
		balance = getData.nextDouble();
		getData.close();
	}
	
	public void showAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: " + balance);
		System.out.println("Account Status: " + accountStatus);
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
}