package Ed_v28_Java_InnerClass.innerclasses;

public class Computer {
    private final String brand;
    private final String model;

    private OperatingSystem os;

    // ---------Constructor---------
    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    // Getter method
    public OperatingSystem getOs() {
        return os;
    }

    // ----------Inner Class----------
    public class OperatingSystem {
        private String osName;

        // -----------Constructor-----------
        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        // Method
        public void displayInfo() {
            System.out.println("Computer brand: " + brand + ", Model: " + model + ", OS: " + osName);
        }

    }

    // -----------Static Nested Class-----------
    static class USB {
        private String usbType;

        // -------------Constructor-------------
        public USB(String usbType) {
            this.usbType = usbType;
        }

        // Method
        public void displayInfo() {
            System.out.println("USB Type: " + usbType);
        }
    }

}
