package Ed_v27_Interfaces.interfaces;

// Cat class impliment Animal interface
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is Eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is Sleeping!");
    }

}
