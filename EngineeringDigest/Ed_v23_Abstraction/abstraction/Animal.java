package Ed_v23_Abstraction.abstraction;

// -----------Abstract Class-----------
public abstract class Animal {
    private String name;
    private int age;

    // --------------getter & Setter--------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // --------------Abstract method--------------
    protected abstract void sayHello();

    // methods
    public void sleep() {
        System.out.println("zzzz...");
    }
}
