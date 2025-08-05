package Ed_v24_AccessModifier_Private_Public_Protected_Default.accessmodifiers.test;

public class School {

    private static School instance;

    // private Constructor not created Obj anywhere
    private School() {

    }

    // methods
    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }
}
