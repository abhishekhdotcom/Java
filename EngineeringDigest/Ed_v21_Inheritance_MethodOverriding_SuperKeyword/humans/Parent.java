package Ed_v21_Inheritance_MethodOverriding_SuperKeyword.humans;

public class Parent extends Grandparent {

    // --------------Constructor--------------
    // parametrised constructor
    public Parent(String name, int age) {
        super(name, age); // super keyword call Immediate Parent method
        System.out.println("Parent Constructor call!");
    }

    // ---------------Method Overriding---------------
    // This is Own Property of Parent
    @Override
    public void hairColor() {
        System.out.println("Hair Brown");
    }

    public void parentMethod() {
        System.out.println("Parent Method call");
    }
}
