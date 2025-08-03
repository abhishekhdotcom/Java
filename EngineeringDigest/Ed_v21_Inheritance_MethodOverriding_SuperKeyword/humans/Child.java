package Ed_v21_Inheritance_MethodOverriding_SuperKeyword.humans;

public class Child extends Parent {

    // --------------Constructors--------------
    // parametrised constructor
    public Child(String name, int age) {
        super(name, age); // super keyword call Immediate Parent method
        System.out.println("Child Constructor call!");
    }

    // ---------------Method Overriding---------------
    // This is Own Property of child
    @Override
    public void skinColor() {
        System.out.println("Skin Fair");
    }

    public void childMethod() {
        super.parentMethod(); // super keyword call Immediate Parent method
        System.out.println("Child Method call");
    }
}
