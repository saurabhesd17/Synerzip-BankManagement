import java.util.Scanner;

// Creating New Bank
public class Bank {
	private static final String IFSC_CODE = "HDFC1000169";
	private String bankName;

	public void createNewBank() {
		Scanner getData = new Scanner(System.in);
		System.out.print("Enter New Bank Name: ");
		bankName = getData.nextLine();
		getData.close();
	}
}