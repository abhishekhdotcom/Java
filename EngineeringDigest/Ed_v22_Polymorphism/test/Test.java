package Ed_v22_Polymorphism.test;

import Ed_v22_Polymorphism.animals.Animal;
import Ed_v22_Polymorphism.animals.Cat;
import Ed_v22_Polymorphism.animals.Dog;

public class Test {
    public static void main(String[] args) {
        // -----------Polymorphism-----------
        Animal dog = new Dog(); // Reference Animal create object dog in runtime
        dog.sayHello();

        Animal cat = new Cat(); // Reference Animal create object dog in runtime
        cat.sayHello();
    }
}
