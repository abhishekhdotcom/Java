package Ed_v28_Java_InnerClass.innerclasses;

public class ShoopingCart {
    private double totalAmount;

    // ----------Constructor-------------
    public ShoopingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Method
    public void paymentProcess(Payment payment) { // Take Reference of Payment Interface
        payment.pay(totalAmount);
    }
}
