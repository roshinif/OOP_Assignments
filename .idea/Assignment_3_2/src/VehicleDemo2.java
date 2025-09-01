public class VehicleDemo2 {

    interface Vehicle {
        void start();
        void stop();
        String getInfo();
    }

    static abstract class AbstractVehicle implements Vehicle {
        protected String type;
        protected String fuel;

        public AbstractVehicle(String type, String fuel) {
            this.type = type;
            this.fuel = fuel;
        }

        @Override
        public void start() {
            System.out.println(type + " is starting...");
        }

        @Override
        public void stop() {
            System.out.println(type + " is stopping...");
        }
    }

    static class Car extends AbstractVehicle {
        public Car(String fuel) {
            super("Car", fuel);
        }

        @Override
        public String getInfo() {
            return "Type: Car\nFuel: " + fuel;
        }
    }

    static class Motorcycle extends AbstractVehicle {
        public Motorcycle(String fuel) {
            super("Motorcycle", fuel);
        }

        @Override
        public String getInfo() {
            return "Type: Motorcycle\nFuel: " + fuel;
        }
    }

    static class Bus extends AbstractVehicle {
        private int capacity;

        public Bus(String fuel, int capacity) {
            super("Bus", fuel);
            this.capacity = capacity;
        }

        @Override
        public String getInfo() {
            return "Type: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
        }
    }

    public static void main(String[] args) {
        System.out.println("Vehicle Inheritance Hierarchy Demonstration\n");

        Vehicle car = new Car("Petrol");
        Vehicle motorcycle = new Motorcycle("Gasoline");
        Vehicle bus = new Bus("Diesel", 40);

        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo() + "\n");
    }
}
