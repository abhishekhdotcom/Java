package com.engineeringdigest.corejava.test;

import com.engineeringdigest.corejava.animals.Cat;
import com.engineeringdigest.corejava.animals.Dog;
import com.engineeringdigest.corejava.vehicles.Car;
import com.engineeringdigest.corejava.vehicles.Cycle;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Developers!");

        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Car car = new Car();
        Cycle cycle = new Cycle();
    }
}
