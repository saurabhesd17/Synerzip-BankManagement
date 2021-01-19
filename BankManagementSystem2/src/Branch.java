import java.util.Scanner;

public class Branch implements Bank {
	private static int branchId = 0;
	private long branchNumber;
	private String branchName;
	private String branchCity;
	private String branchState;
	private String branchCountry;
	private String branchAddress;
	private String IFSC_CODE;
	private int random;
	private final String bankName = "HDFC";

	public void createNewBranch() {
		random = (int) (Math.random() * (000000 - 100000 + 1) + 000000);
		IFSC_CODE = "HDFC" + String.valueOf(random);
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

	public void showBranchDetails() {
		System.out.println(IFSC_CODE);
		System.out.println(branchId);
		System.out.println(branchName);
		System.out.println(branchCity);
		System.out.println(branchState);
		System.out.println(branchCountry);
		System.out.println(branchAddress);
		System.out.println(branchNumber);
		System.out.println(bankName);
	}

	public static int getBranchId() {
		return branchId;
	}

	public static void setBranchId(int branchId) {
		Branch.branchId = branchId;
	}

	public long getBranchNumber() {
		return branchNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public String getBranchState() {
		return branchState;
	}

	public String getBranchCountry() {
		return branchCountry;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchNumber(long branchNumber) {
		this.branchNumber = branchNumber;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}

	public void setBranchCountry(String branchCountry) {
		this.branchCountry = branchCountry;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

}