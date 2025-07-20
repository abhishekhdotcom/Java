public class Ed_v14_Mastring_1D_2D_Array {
    public static void main(String[] args) {
        // ----1D Array----
        // type[] variableName;
        int[] arr = new int[10];

        arr[3] = 103;
        arr[7] = 107;
        arr[9] = 109;

        // For loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // For-Each loop
        for (int i : arr) {
            System.out.println(i);
        }

        // Q1. Search an element an Array?
        int[] arr1 = { 1, 4, 8, 7, 55, 3 };

        for (int i : arr1) {
            if (i == 55) {
                System.out.println("Found: " + i);
            }
        }

        // Q2. Find max element?
        int[] arr2 = new int[5];

        arr2[0] = 4;
        arr2[1] = -9;
        arr2[2] = 44;
        arr2[3] = 77;
        arr2[4] = -6;

        int res = Integer.MIN_VALUE;

        for (int i : arr2) {
            if (i > res) {
                res = i;
            }
        }
        System.out.println(res);

        // Q3. Print reverse Array?
        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);
        }

        // Q4. Sum of Array?
        int[] arr4 = { -4, 8, 3, 4, -7, 52 };
        int sum = 0;

        for (int i : arr4) {
            sum += i;
        }
        System.out.println(sum);

        // -----2D Array-----
        // int[][] arrr = new int[3][3];
        int[][] arrr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println(arrr[1][2]);

        for (int[] num : arrr) {
            for (int j = 0; j < arrr.length; j++) {
                System.out.println(num[j]);
            }
        }
    }
}
