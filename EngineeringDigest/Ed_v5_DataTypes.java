public class Ed_v5_DataTypes {
    public static void main(String[] args) {
        // =========== Data Types ===========
        // -------Integral Numbers-------
        // byte
        // short
        // int
        // long

        byte age = 127;
        short age1 = 32767;
        int age2 = -2147483648;
        long age3 = 2147483649l;
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
        
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // -------Decimal Numbers-------
        // float
        // double

        // -------Character-------
        // char
        for (int i = 0; i <= 127; i++) {
            System.out.println((char) i);
        }

        // -------Boolean-------
        // bool
        boolean isEligible = false;
        System.out.println(isEligible);

    }
}