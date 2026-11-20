package util;

public class bankingSystem {
	
	private int accountNumber;
    public String cardholderName;
    private double accountBalance;
    
    public bankingSystem(int accountNumber, String cardholderName) {
		this.accountNumber = accountNumber;
		this.cardholderName = cardholderName;
	}
    
    public bankingSystem(int accountNumber, String cardholderName, double deposit) {
		this.accountNumber = accountNumber;
		this.cardholderName = cardholderName;
		enterValue(deposit);
	}
    
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + cardholderName + ", Balance: $" + accountBalance;
	}
	
	public void enterValue(double deposit) {
		accountBalance += deposit;
	}
	
	public void exitValue(double withdraw) {
		accountBalance -= withdraw + 5.00;
	}

    
}