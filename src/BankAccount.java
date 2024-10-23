public class BankAccount {
    protected double balance;
    private String accountNumber;
    public BankAccount(double initialBalance,String accountNumber){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal amount exceeds the balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}


