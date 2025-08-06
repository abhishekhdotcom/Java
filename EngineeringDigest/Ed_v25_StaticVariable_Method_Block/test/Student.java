package Ed_v25_StaticVariable_Method_Block.test;

public class Student {
    private int id;
    private String name;
    private int age;

    // ------------Student static Variable------------
    public static int count = 0;

    // ------------Static Block------------
    static {
        System.out.println("Hello!");
    }

    // ------------Constructor------------
    public Student() {
        count++; // count increase +1 creation on every new Object
    }

    // ------------Getter & Setter methods------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    // ------------Static method------------
    public static void getCount() {
        System.out.println("Total Number Of Students: " + count);
    }
}
