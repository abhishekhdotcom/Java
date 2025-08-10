package Ed_v28_Java_InnerClass.innerclasses;

public class Test {
    public static void main(String[] args) {
        // Create a new Car instance with model
        Car car = new Car("Verna");

        // Create an instance of the inner Engine class, to the car instance
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        // Create a new audi car instance with model "Audi A8"
        Car audiCar = new Car("Audi A8");
        Engine turboEngine = new Engine(audiCar);
        turboEngine.start();
        turboEngine.stop();

        // Create a new Computer instance
        Computer computer = new Computer("Asus", "Vivobook K513 Oled", "Windows 11");
        computer.getOs().displayInfo();

        // Create an instance of the static inner USB class, to the Computer instance
        Computer.USB usb = new Computer.USB("Type-C Gen-4");
        usb.displayInfo();

        // ShoppingCart new Object
        ShoopingCart shoopingCart = new ShoopingCart(85000);
        // CreditCard new Object
        CreditCard creditCard = new CreditCard("44345221181");
        shoopingCart.paymentProcess(creditCard);

        // Hotel new Object
        Hotel hotel = new Hotel("Sr.Krishna Resort", 80, 120);
        hotel.reservedRoom("Sagar Pal", 4);
    }
}