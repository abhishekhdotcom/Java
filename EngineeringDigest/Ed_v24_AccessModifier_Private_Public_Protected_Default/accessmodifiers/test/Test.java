package Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.test;

import Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.zoo.*;

public class Test {
    public static void main(String[] args) {
        School.getInstance();

        Dog dog = new Dog("Lilly");
        dog.makeSound();
        dog.changeSound("Woof");
    }
}
