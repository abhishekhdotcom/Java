package Ed_v27_Interfaces.interfaces;

// Interface is Blue Print for creating Class
public interface Animal {

    public static final int Max_AGE = 150; // not needed Static Or Final Keyword

    // --------------Abstract method--------------
    public abstract void eat(); // not needded abstract

    void sleep();

    // --------------Static Methods--------------
    public static void info() {
        System.out.println("This is an animal Interface static info Method");
    }

    // --------------default Methods--------------
    public default void run(int a, int b) {
        this.eat();
        System.out.println("Animal is Runing!");
        System.out.println("Sum of a + b: " + (a + b));
    }
}
