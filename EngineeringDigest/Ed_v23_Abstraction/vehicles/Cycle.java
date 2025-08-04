package Ed_v23_Abstraction.vehicles;

public class Cycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Accelerate Cycle");
    }

    @Override
    public void decelerate() {
        System.out.println("Deacclerate Cycle");
    }

}
