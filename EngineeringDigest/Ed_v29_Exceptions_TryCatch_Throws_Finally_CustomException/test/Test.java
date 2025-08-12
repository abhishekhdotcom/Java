package Ed_v29_Exceptions_TryCatch_Throws_Finally_CustomException.test;

public class Test {
    public static void main(String[] args) {
        int[] numerators = { 10, 100, 30, 40 };
        int[] denominators = { 1, 2, 0, 4 };

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Good Job Developer!");

        // ------------BankAccount Object Creation------------
        BankAccount bankAccount = new BankAccount(1100);
        try {
            bankAccount.withdraw(1220);
        } catch (InSufficientFundsException e) {
            System.out.println(e.getAmount());
            System.out.println(e);
        }
    }

    // methods
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) { // RunTime Exception
            System.out.println("Arithmetic Exception");
            return -1;
        } catch (Exception e) { // RunTime Exception
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("By Developer!");
        }
    }
}
