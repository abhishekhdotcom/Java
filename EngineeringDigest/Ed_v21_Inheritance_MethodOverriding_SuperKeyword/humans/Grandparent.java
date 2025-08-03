package Ed_v21_Inheritance_MethodOverriding_SuperKeyword.humans;

public class Grandparent {
    private String name;
    private int age;
    private boolean hasSuperPowers;

    // --------------Constructors--------------
    // parametrised constructor
    public Grandparent(String name, int age) {
        this.name = name;
        this.age = age;

        hasSuperPowers = false;
        System.out.println("Grandparent Constructor call!");
    }

    // ----------------Getter & Setter methods----------------
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

    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }

    // ----------------Methods----------------
    // This is Own Property of Grandparent
    public void hairColor() {
        System.out.println("Hair Black");
    }

    public void skinColor() {
        System.out.println("Skin Dark");
    }
}
