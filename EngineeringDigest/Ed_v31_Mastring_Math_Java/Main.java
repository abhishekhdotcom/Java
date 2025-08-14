public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        int max = Math.max(a, b);
        System.out.println("Max Number: " + max);

        int min = Math.min(a, b);
        System.out.println("Min Number: " + min);

        int c = -11;
        int positiveNumber = Math.abs(c);
        System.out.println("Positive Number: " + positiveNumber);

        double d = 1.52;
        double doubleNum = Math.ceil(d);
        System.out.println("Ceil Number: " + doubleNum);

        double florNum = Math.floor(d);
        System.out.println("Floor Number: " + florNum);

        double roundNum = Math.round(d);
        System.out.println("Round Number: " + roundNum);

        double sqrt = Math.sqrt(144);
        System.out.println("Square Root: " + sqrt);

        double power = Math.pow(12, 2);
        System.out.println("Power: " + power);

        double l = Math.log(10);
        System.out.println("Log: " + l);

        double ll = Math.log10(10);
        System.out.println("Log10: " + ll);

        double random = Math.random();
        System.out.println("Random Number: " + random);
    }
}
