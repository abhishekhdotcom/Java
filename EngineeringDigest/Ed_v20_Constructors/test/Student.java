package Ed_v20_Constructors.test;

public class Student {
    // Properties | Fields | Instance variable & Behaviour
    // Not access to set directly values outside Student class
    private String name;
    private int rollNumber;
    private int age;

    // ---------------Constructor-------------------
    // parametrised constuctor
    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(int rollNumber, int age) {
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Getter and Setter methods
    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // RollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age!");
        } else {
            this.age = age;
        }
    }

}
