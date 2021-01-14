import java.util.Date;
import java.util.Scanner;

public class Transaction {
	private static int transactionId = 201;
	private Date transactionDate = new Date();
	private String transactionType;
	private double transactionAmount;

	public void makeNewTransaction() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter Customer Name: ");
		transactionType = getData.nextLine();
		System.out.print("\nEnter Customer Email: ");
		transactionAmount = getData.nextDouble();
		getData.close();
	}
}