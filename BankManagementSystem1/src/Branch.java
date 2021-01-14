import java.util.Scanner;

// Creating New Branch
public class Branch {
	private static int branchId = 0;
	private int branchNumber;
	private String branchName;
	private String branchCity;
	private String branchState;
	private String branchCountry;
	private String branchAddress;

	public void createNewBranch() {
		Scanner getData = new Scanner(System.in);
		System.out.print("\nEnter New Branch Name: ");
		branchName = getData.nextLine();
		System.out.print("\nEnter New Branch City: ");
		branchCity = getData.nextLine();
		System.out.print("\nEnter New Branch State: ");
		branchState = getData.nextLine();
		System.out.print("\nEnter New Branch Country: ");
		branchCountry = getData.nextLine();
		System.out.print("\nEnter New Branch Address: ");
		branchAddress = getData.nextLine();
		System.out.print("\nEnter New Branch Number: ");
		branchNumber = getData.nextInt();
		branchId++;
		getData.close();
	}
}