package Ed_v26_Mastring_Final_Keyword.vehicles;

// Final Class 
public final class Car extends Vehicle {

    // Final methods can't changable
    private final int speedLimit = 280;

    // Getter methods
    public int getSpeedLimit() {
        return speedLimit;
    }

    // Method override
    @Override
    public void accelerate() {
        System.out.println("Accelerate Car");
    }

    @Override
    public void decelerate() {
        System.out.println("Deacclerate Car");
    }

    // Methods
    public final void airBags() {
        System.out.println("4 Air Bags!");
    }
}
