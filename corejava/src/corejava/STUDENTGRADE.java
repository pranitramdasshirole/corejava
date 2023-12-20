package corejava;

public class STUDENTGRADE {
	public class BankAccount {
	    private String accountNumber;
	    private String accountHolder;
	    private double balance;
	    private static int totalAccounts = 0;

	    public BankAccount(String accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	        totalAccounts++;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    public static void main(String[] args) {
	        BankAccount account1 = new BankAccount("12345", "John Doe", 1000.0);
	        BankAccount account2 = new BankAccount("67890", "Jane Smith", 500.0);

	        // Deposit and withdraw money
	        account1.deposit(500.0);
	        account2.withdraw(200.0);

	        // Print account information
	        System.out.println("Account 1 balance: $" + account1.balance);
	        System.out.println("Account 2 balance: $" + account2.balance);

	        // Get the total number of accounts
	        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
	    }
	}
      
      
      


}
