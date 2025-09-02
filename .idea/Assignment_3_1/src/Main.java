public class Main {
    public static void main(String[] args) {
        // Task 1: SportsCar
        Car normalCar = new Car("Toyota");
        SportsCar sportsCar = new SportsCar("Ferrari");

        System.out.println("--- Task 1: SportsCar ---");
        normalCar.accelerate();
        System.out.println(normalCar.getModel() + " speed: " + normalCar.getSpeed() + " | Fuel: " + normalCar.getFuel());

        sportsCar.accelerate();
        System.out.println(sportsCar.getModel() + " speed: " + sportsCar.getSpeed() + " | Fuel: " + sportsCar.getFuel());

        sportsCar.decelerate(15);
        System.out.println(sportsCar.getModel() + " after deceleration: " + sportsCar.getSpeed());

        // Task 2: Bus
        Bus bus = new Bus("Volvo Bus", 3);

        System.out.println("\n--- Task 2: Bus ---");
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter(); // bus is full

        bus.passengerExit();
        bus.passengerExit();
        bus.passengerExit();
        bus.passengerExit(); // no passengers

        bus.accelerate();
        System.out.println("Bus Speed: " + bus.getSpeed() + " | Fuel: " + bus.getFuel());
    }
}
