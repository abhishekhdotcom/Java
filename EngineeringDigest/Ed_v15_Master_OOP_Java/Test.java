package Ed_v15_Master_OOP_Java;

public class Test {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.year = 2025; // We cant set bcs this is private

        // car.accelerate(5);
        // System.out.println(car.speed);

        Cat cat = new Cat();
        cat.age = 4;
        cat.name = "Bob";
        System.out.println(cat.age);

        // Polymorphism
        Animal dog = new Cat();
        dog.makeSound();
    }
}
