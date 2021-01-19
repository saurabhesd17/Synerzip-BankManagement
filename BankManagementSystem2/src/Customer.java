import java.util.Scanner;

public class Customer {
	private static int customerId = 100;
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
		customerId++;
	}

	public void showCustomerData() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Email: " + customerEmail);
		System.out.println("Customer Address: " + customerAddress);
		System.out.println("Customer Number: " + customerNumber);
	}
	
	public static int getCustomerId() {
		return customerId;
	}

	public long getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public static void setCustomerId(int customerId) {
		Customer.customerId = customerId;
	}

	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
}