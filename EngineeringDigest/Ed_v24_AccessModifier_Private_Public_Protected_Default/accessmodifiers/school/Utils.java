package Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.school;

import Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.test.School;

public class Utils {

    public static void main(String[] args) {
        School.getInstance();
    }

    // Constructor
    private Utils() {

    }

    // methods
    public static void sayHello() {
        System.out.println("Hello Developer!");
    }

    public static void sayBy() {
        System.out.println("By Developer!");
    }
}
