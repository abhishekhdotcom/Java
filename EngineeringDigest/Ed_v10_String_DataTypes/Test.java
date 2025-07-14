package Ed_v10_String_DataTypes;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Vipul Taygi";
        s.address = "Banglore";
        s.standard = 12;
        s.rollNumber = 5;
        System.out.println("Name: " + s.name);
        System.out.println("Address: " + s.address);
        System.out.println("Class: " + s.standard);
        System.out.println("Roll: " + s.rollNumber);
    }
}
