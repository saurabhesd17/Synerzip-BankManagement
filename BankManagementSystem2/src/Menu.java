import java.util.Scanner;

public class Menu {
	public Menu() {
		boolean condition = true;

		while (condition) {
			System.out.println("Press key for:");
			System.out.println("1.Branch");
			System.out.println("2.Customer");
			System.out.println("3.Create Account");
			System.out.println("4.Account Details");
			System.out.println("5.To exit press any key");

			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("1.Create New Branch");
				System.out.println("2.Show Branch Details");
				System.out.println("3.Go back to previous menu");
				Branch branch = new Branch();
				int branchChoice = in.nextInt();

				switch (branchChoice) {
				case 1:
					branch.createNewBranch();
					break;
				case 2:
					branch.showBranchDetails();
					break;
				case 3:
					break;
				default:
					System.out.println("oops wrong choice try again.");
				}
				break;

			case 2:
				System.out.println("1.Create New Customer");
				System.out.println("2.Show Customer Details");
				System.out.println("3.Go back to previous menu");
				Customer customer = new Customer();
				int customerChoice = in.nextInt();

				switch (customerChoice) {
				case 1:
					customer.createNewCustomer();
					break;
				case 2:
					customer.showCustomerData();
					break;
				case 3:
					break;					
				default:
					System.out.println("oops wrong choice");
					break;
				}
				break;

			case 3:
				System.out.println("1.Savings Account");
				System.out.println("2.Current Account");
				System.out.println("3.Go back to previous menu");
				int accountChoice = in.nextInt();

				switch (accountChoice) {
				case 1:
					SavingsAccount accountS = new SavingsAccount();
					accountS.createNewAccount();
					break;
				case 2:
					CurrentAccount accountC = new CurrentAccount();
					accountC.createNewAccount();
					break;					
				case 3:
					break;
				default:
					System.out.println("oops wrong choice");
					break;
				}
				break;

			case 4:
				System.out.println("1.Savings Account");
				System.out.println("2.Current Account");
				System.out.println("3.Go back to previous menu");
				int detailsChoice = in.nextInt();

				switch (detailsChoice) {
				case 1:
					SavingsAccount accountS = new SavingsAccount();
					accountS.showAccountDetails();
					break;
				case 2:
					CurrentAccount accountC = new CurrentAccount();
					accountC.showAccountDetails();
					break;
				case 3:
					break;					
				default:
					System.out.println("oops wrong choice");
					break;
				}
				break;

			case 5:
				System.out.println("Have a Nice day :)");
				condition = false;
				break;

			default:
				System.out.println("Have a Nice day :)");
				condition = false;
				break;
			}
		}
	}
}
