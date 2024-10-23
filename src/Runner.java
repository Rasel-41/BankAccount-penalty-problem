public class Runner {
    public static void main(String[] args) {
        BasicAccount myAccount = new BasicAccount(100.0, "123456789");
        myAccount.deposit(50);       // Deposit $50
        myAccount.withdraw(120);     // Withdraw $120 (will not result in overdraft)
        myAccount.withdraw(50);      // Withdraw $50 (will result in overdraft, applying penalty)
    }
}


