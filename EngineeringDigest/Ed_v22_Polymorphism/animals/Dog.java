package Ed_v22_Polymorphism.animals;

public class Dog extends Animal {
    // methods
    @Override
    public void sayHello() {
        System.out.println("Bark");
    }

    public void sayBy() {
        System.out.println("Bark... bark...");
    }
}
