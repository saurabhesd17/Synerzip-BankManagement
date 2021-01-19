public abstract class Account {
	protected int accountNumber;
	
	public abstract void createNewAccount();//define code here
	public abstract void showAccountDetails();//define code here
	//assignUserToAccount(;)
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}