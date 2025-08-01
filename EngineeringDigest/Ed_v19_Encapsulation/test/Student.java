package Ed_v19_Encapsulation.test;

public class Student {
    // Properties | Fields | Instance variable & Behaviour
    // Not access to set directly values outside Student class
    private String name;
    private int rollNumber;
    private int age;

    // -----------Incapsulation------------
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
