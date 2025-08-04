package Ed_v23_Abstraction.abstraction;

import Ed_v23_Abstraction.vehicles.Car;
import Ed_v23_Abstraction.vehicles.Cycle;
import Ed_v23_Abstraction.vehicles.Vehicle;

public class Test {
    public static void main(String[] args) {
        // Animal
        Dog dog = new Dog();
        dog.setName("Lilly");
        dog.setAge(4);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.sleep();

        Cat cat = new Cat();
        cat.sleep();

        // Vehicles
        Vehicle car = new Car();
        car.accelerate();
        car.decelerate();

        Vehicle cycle = new Cycle();
        cycle.accelerate();
        cycle.decelerate();
    }
}
