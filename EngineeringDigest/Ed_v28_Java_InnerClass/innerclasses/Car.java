package Ed_v28_Java_InnerClass.innerclasses;

public class Car {
    private final String model;
    private boolean isEngineOn;

    // ----------Constructor----------
    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    // Gerrer Method
    public String getModel() {
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }


    // ----------Inner Calss----------
    // Non-static inner class Engine
    class Engine {

        // Method
        public void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " Engine Started!");
            } else {
                System.out.println(model + " Engine is Already On!");
            }
        }

        public void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " Engine Off!");
            } else {
                System.out.println(model + " Engine is Already Off!");
            }
        }

    }
}
