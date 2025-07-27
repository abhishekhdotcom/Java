public class Ed_v16_Methods {
    public static void main(String[] args) {
        int[] a = { 4, 8, 6, 4, 7, 9, };
        int sum1 = sumOfArray(a); // method call
        System.out.println(sum1);

        int[] b = { 7, 87, 46, 24, 73, 9, };
        int sum2 = sumOfArray(b); // method call
        System.out.println(sum2);

        String s = "     hello developer     ";
        String capString = upperFunction(s);
        System.out.println(capString);
    }

    // -------------Methods-------------

    // Sum all array
    public static int sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

    // Remove spaces and Transform upperCase
    private static String upperFunction(String str) {
        return str.trim().toUpperCase();
    }
}
