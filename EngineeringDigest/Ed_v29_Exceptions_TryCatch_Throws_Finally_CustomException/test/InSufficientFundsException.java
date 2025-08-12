package Ed_v29_Exceptions_TryCatch_Throws_Finally_CustomException.test;

// -----------------Custom Exception Create-----------------
public class InSufficientFundsException extends Exception {

    private double amount;

    // ------------Constructor------------
    public InSufficientFundsException(double amount) {
        super("What Do You Want ? You don't have Money!");
        this.amount = amount;

    }

    // Getter method
    public double getAmount() {
        return amount;
    }
}
