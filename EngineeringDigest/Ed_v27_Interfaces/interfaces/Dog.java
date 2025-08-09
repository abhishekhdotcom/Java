package Ed_v27_Interfaces.interfaces;

// Dog class impliment Animal interface
public class Dog implements Animal {
    // Method Override
    @Override
    public void eat() {
        System.out.println("Dog is Eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping!");
    }

}
