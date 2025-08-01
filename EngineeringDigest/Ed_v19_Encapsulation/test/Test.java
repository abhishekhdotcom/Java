package Ed_v19_Encapsulation.test;

public class Test {
    public static void main(String[] args) {
        // ----------Student----------
        Student student = new Student();
        student.setAge(23); // set age
        int age = student.getAge(); // get age
        System.out.println(age);

        // ----------BanckAccount----------
        BankAccount bank = new BankAccount();

        // Check Total Balance
        double totalBalance = bank.getBalance();
        System.out.println("Total Balance: " + totalBalance);

        // Amount Deposit
        bank.deposit(15000);

        // Amount Withdraw
        bank.withdraw(2500);

    }
}
