package Ed_v28_Java_InnerClass.innerclasses;

public class CreditCard implements Payment {
    private  String CreditCardNumber;

    // ---------Constructor----------
    public CreditCard(String CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    // Method Override
    @Override
    public void pay(double amount) {
        System.out.println("Payment Done: " + amount + " Using Credit card Number " + CreditCardNumber);
    }

}
