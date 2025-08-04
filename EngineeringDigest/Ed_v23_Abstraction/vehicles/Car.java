package Ed_v23_Abstraction.vehicles;

public class Car extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Accelerate Car");
    }

    @Override
    public void decelerate() {
        System.out.println("Deacclerate Car");
    }

}
