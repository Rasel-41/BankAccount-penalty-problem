public class BasicAccount extends BankAccount{
    private static final double OVERDRAFT_PENALTY = 30.0;
    public BasicAccount(double initialBalance, String accountNumber) {
        super(initialBalance, accountNumber);
    }
    public void withdraw(double amount){
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New Balance: $" + balance);
            if (balance < 0) {
                balance -= OVERDRAFT_PENALTY;
                System.out.println("Overdraft penalty of $30 applied. New Balance: $" + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}



