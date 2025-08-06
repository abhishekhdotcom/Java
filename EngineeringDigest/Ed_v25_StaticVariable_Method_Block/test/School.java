package Ed_v25_StaticVariable_Method_Block.test;

public class School {

    // Private static School object initilize
    private static School school = new School();

    // -----------Private Constructor-----------
    private School() {

    }

    // ------------static methods------------
    public static School getInstance() {
        System.out.println("School");
        return school;
    }
}
