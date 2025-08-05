package Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.zoo;

public class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name, "Bark");
    }

    // methods
    public void wagTail() {
        System.out.println(getName() + " is wagging its tail.");
    }

    private String getName() {
        return getClass().getSimpleName();
    }

    public void setDogSound(String newSound) {
        changeSound(newSound);  
    }
}
