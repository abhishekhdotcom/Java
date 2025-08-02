package Ed_v20_Constructors.test;

public class Test {
    public static void main(String[] args) {
        // ----------Student----------
        // parametrised Student constructor
        Student student = new Student("Abhishekh Kumar", 5, 23);

        System.out.println("Name: " + student.getName());
        System.out.println("RollNo: " + student.getRollNumber());
        System.out.println("Age: " + student.getAge());

    }
}