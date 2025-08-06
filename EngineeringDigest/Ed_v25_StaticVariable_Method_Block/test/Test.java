package Ed_v25_StaticVariable_Method_Block.test;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Supriya Kumari");
        student1.setAge(23);

        Student student2 = new Student();
        student1.setId(2);
        student1.setName("Shristy Kumari");
        student1.setAge(22);

        Student student3 = new Student();
        student1.setId(3);
        student1.setName("Priya Raj");
        student1.setAge(24);

        Student student4 = new Student();
        student1.setId(4);
        student1.setName("Nisha Kumari");
        student1.setAge(23);

        Student student5 = new Student();
        student1.setId(5);
        student1.setName("Abhishekh Kumar");
        student1.setAge(23);

        // Get Total Count Of Students reference Class not obj
        Student.getCount();

        // Get Min & Max Numbers using Utils class
        System.out.println("Max Number: " + Utils.max(14, 74));
        System.out.println("Min Number: " + Utils.min(7, 4));

        // Get Captlize String & Trim using Utils class
        System.out.println("Captlize & Trim String: " + Utils.trimAndUppercase("       Hello Developers        !"));

        // Get only one Instance of School
        School.getInstance();
    }
}
