package Ed_v28_Java_InnerClass.innerclasses;

public class Engine {
    private final Car car;

    // ---------Constructor---------
    public Engine(Car car) {
        this.car = car;
    }

    // Method
    public void start() {
        if (!car.isEngineOn()) {
            car.setEngineOn(true);
            System.out.println(car.getModel() + " Turbo Engine Started!");
        } else {
            System.out.println(car.getModel() + " Turbo Engine is Already On!");
        }
    }

    public void stop() {
        if (car.isEngineOn()) {
            car.setEngineOn(false);
            System.out.println(car.getModel() + " Turbo Engine Off!");
        } else {
            System.out.println(car.getModel() + " Turbo Engine is Already Off!");
        }
    }
}
