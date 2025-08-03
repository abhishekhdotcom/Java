package Ed_v21_Inheritance_MethodOverriding_SuperKeyword.test;

import Ed_v21_Inheritance_MethodOverriding_SuperKeyword.humans.Grandparent;
import Ed_v21_Inheritance_MethodOverriding_SuperKeyword.humans.Parent;
import Ed_v21_Inheritance_MethodOverriding_SuperKeyword.humans.Child;

public class Test {
    public static void main(String[] args) {
        // -------------Inheritance-------------
        // Grandparent have own Properties
        Grandparent grandparent = new Grandparent("Lal Keshwar Bhagat", 28); // parametrised constructor
        System.out.println("Grandparent name: " + grandparent.getName());
        System.out.println("Grandparent age: " + grandparent.getAge());
        grandparent.hairColor(); // Hair Black
        grandparent.skinColor(); // Skin Dark
        System.out.println("Super Power: " + grandparent.hasSuperPowers());
        System.out.println();

        // inheriat Grandparent Properties --> Parent
        Parent parent = new Parent("Sunil Kumar", 38); // parametrised constructor
        System.out.println("parent name:" + parent.getName());
        System.out.println("parent age:" + parent.getAge());
        parent.hairColor(); // Hair Brown (This is Own Properties not Inheriat to Grandparent)
        parent.skinColor(); // Skin Dark
        System.out.println("Super Power: " + parent.hasSuperPowers());
        System.out.println();

        // inheriat Grandparent Properties --> Parent --> Child
        Child child = new Child("Sagar Pal", 16); // parametrised constructor
        System.out.println("Child name: " + child.getName());
        System.out.println("Child age: " + child.getAge());
        child.hairColor(); // Hair Brown
        child.skinColor(); // Skin fair (This is Own Properties not Inheriat to Parent)
        System.out.println("Super Power: " + child.hasSuperPowers());
        child.childMethod();
    }
}
