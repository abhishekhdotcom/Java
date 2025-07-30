public class Ed_v17_Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // factorial without Recursion
        System.out.println(factorialRecursion(5)); // factorial using Recursion
        System.out.println(sumOfNNaturalNum(5)); // sum of n natural number without Recursion
        System.out.println(sumOfNNaturalNumbers(5)); // sum of n natural number using Recursion
    }

    // -----------Factorial without using recursion-----------
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // -----------Factorial using Recursion-----------
    public static int factorialRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    // ----------Sum of n Natural Numbers without Recursion-----------
    public static int sumOfNNaturalNum(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    // ----------Sum of n Natural Numbers using Recursion-----------
    public static int sumOfNNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNNaturalNumbers(n - 1);
    }

}
