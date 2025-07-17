public class Ed_v13_Loops_For_While_DoWhile {
    public static void main(String[] args) {
        // ---------Loops---------
        // While loop
        int i = 0;
        while (i < 10) {
            System.out.println("Hello" + i);
            i++;
        }

        // ----------do-While loops---------
        int j = 100;
        do {
            System.out.println("Hello" + j);
            j++;
        } while (j <= 50);

        // ----------For loop----------
        for (int k = 0; k < 10; k++) {
            System.out.println("Hello" + k);
        }

        // -------Print design-------
        /*
         * 1
         * 10
         * 100
         * 1000
         * 10000
         * 100000
         */
        for (int k = 1, m = 1; m <= 6; k = k * 10, m++) {
            System.out.println(k);
        }

        // --------Write Table---------
        int num = 7;
        for (int k = 1; k <= 10; k++) {
            System.out.println(num + " x " + k + " = " + k * num);
        }

        // ---------Sum of first 10 natural number---------
        int sum = 0;
        int a = 1;
        while (a <= 10) {
            sum = sum + a;
            a++;
        }
        System.out.println(sum);

        // ---------Count number of digits----------
        int n = 467246924;
        int result = 0;

        while (n > 0) {
            n = n / 10;
            result++;
        }
        System.out.println(result);

        // ---------factorial of a number--------
        // 7! = 1*2*3*4*5*6**7 = 720

        int num1 = 6;
        int result1 = 1;
        while (num1 > 0) {
            result1 = result1 * num1;
            num1--;
        }
        System.out.println(result1);

        // ----------Design Print---------
        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******

        for (int k = 0; k < 6; k++) {
            for (int x = 0; x <= k; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
