package Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.zoo;

public class Animal {
    public String name; // access anywhere public accessModifier
    protected String sound;

    // Constructor
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Methods
    public void makeSound() {
        System.out.println(name + " Make a Sound: " + sound);
    }

    protected void changeSound(String newSound) {
        this.sound = newSound;
    }

}
