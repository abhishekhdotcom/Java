package Ed_v25_StaticVariable_Method_Block.test;

public class Utils {

    // ---------------Methods--------------
    // Return max number
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // Return min number
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    // Return Captlize String and Trim
    public static String trimAndUppercase(String str) {
        if (str != null) {
            return str.trim().toUpperCase();
        } else {
            return "";
        }
    }

}
