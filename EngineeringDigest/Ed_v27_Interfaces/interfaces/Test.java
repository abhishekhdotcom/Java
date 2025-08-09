package Ed_v27_Interfaces.interfaces;

public class Test {
    public static void main(String[] args) {
        // Dog Class obj
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.run(4, 8);

        // Cat Class obj
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.run(8,6);

        System.out.println(Dog.Max_AGE);
        System.out.println(Animal.Max_AGE);

        // ANimal Interface static methods call
        Animal.info();
    }
}
