import java.util.Scanner;

public class Customer {
	private static int customerId = 101;
	private long customerNumber;
	private String customerName;
	private String customerAddress;
	private String customerEmail;

	public void createNewCustomer() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Customer Name: ");
		customerName = getData.nextLine();
		System.out.print("\nEnter Customer Email: ");
		customerEmail = getData.nextLine();
		System.out.print("\nEnter Customer Address: ");
		customerAddress = getData.nextLine();
		System.out.print("\nEnter Customer Number: ");
		customerNumber = getData.nextLong();
		getData.close();
	}

	public void showCustomerData() {
		System.out.println("Customer ID: " + customerId);
//		System.out.println("Account Number: " + Account.Account_Number);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Email: " + customerEmail);
		System.out.println("Customer Address: " + customerAddress);
		System.out.println("Customer Number: " + customerNumber);
	}
}