import java.util.Date;
import java.util.Scanner;

public class Transaction {
	enum type{
		DEBIT,
		CREDIT;
	}
	
	private static int transactionId = 200;
	private Date transactionDate = new Date();
	private String transactionType = String.valueOf(type.DEBIT);
	private double transactionAmount;
	//private int accountNumber = getAccountNumber();

	public void makeNewTransaction() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Transaction Amount: ");
		transactionAmount = getData.nextDouble();
		System.out.println("Enter Transaction Type: ");
		System.out.println("1.Enter D for Debit");
		System.out.println("2.Enter C for Credit");
		char choice = getData.next().charAt(0);
		getData.close();
		transactionId++;
	}
}