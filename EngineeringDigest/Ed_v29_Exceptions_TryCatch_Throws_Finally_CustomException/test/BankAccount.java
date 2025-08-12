package Ed_v29_Exceptions_TryCatch_Throws_Finally_CustomException.test;

public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double amount) {
        this.balance = amount;
    }

    // Methods
    public void withdraw(double amount) throws InSufficientFundsException {
        if (amount > balance) {
            throw new InSufficientFundsException(amount);
        } else {
            balance -= amount;
        }
    }

}
