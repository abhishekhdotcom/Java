package Ed_v19_Encapsulation.test;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Avaliable Balance: " + this.balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Avaliable Balance: " + this.balance);
        } else {
            System.out.println("Invalid Withdraw Amount!");
        }
    }

    // ------------Incapsulation------------
    // AccountNumber
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Balance
    public double getBalance() {
        return balance;
    }
}
