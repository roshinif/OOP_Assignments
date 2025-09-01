public class VehicleDemo3 {

    interface Vehicle {
        void start();
        void stop();
        String getInfo();
    }

    interface ElectricVehicle {
        void charge();
    }

    static abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
        String type;
        String fuel;

        AbstractVehicle(String type, String fuel) {
            this.type = type;
            this.fuel = fuel;
        }

        public void start() {
            System.out.println(type + " is starting...");
        }

        public void stop() {
            System.out.println(type + " is stopping...");
        }

        public void charge() {
            System.out.println(type + " cannot be charged.");
        }
    }

    static class Car extends AbstractVehicle {
        Car(String fuel) {
            super("Car", fuel);
        }

        public String getInfo() {
            return "Type: Car\nFuel: " + fuel;
        }
    }

    static class Motorcycle extends AbstractVehicle {
        Motorcycle(String fuel) {
            super("Motorcycle", fuel);
        }

        public String getInfo() {
            return "Type: Motorcycle\nFuel: " + fuel;
        }
    }

    static class Bus extends AbstractVehicle {
        int capacity;

        Bus(String fuel, int capacity) {
            super("Bus", fuel);
            this.capacity = capacity;
        }

        public String getInfo() {
            return "Type: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
        }
    }

    static class ElectricCar extends AbstractVehicle {
        ElectricCar() {
            super("Electric Car", "Electricity");
        }

        public String getInfo() {
            return "Type: Electric Car\nFuel: " + fuel;
        }

        public void charge() {
            System.out.println("Electric Car is charging...");
        }
    }

    static class ElectricMotorcycle extends AbstractVehicle {
        ElectricMotorcycle() {
            super("Electric Motorcycle", "Electricity");
        }

        public String getInfo() {
            return "Type: Electric Motorcycle\nFuel: " + fuel;
        }

        public void charge() {
            System.out.println("Electric Motorcycle is charging...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Electric Vehicle Demonstration\n");

        Car car = new Car("Petrol");
        Motorcycle bike = new Motorcycle("Gasoline");
        Bus bus = new Bus("Diesel", 40);
        ElectricCar eCar = new ElectricCar();
        ElectricMotorcycle eBike = new ElectricMotorcycle();

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        car.charge();
        System.out.println();

        bike.start();
        bike.stop();
        System.out.println(bike.getInfo());
        bike.charge();
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        bus.charge();
        System.out.println();

        eCar.start();
        eCar.stop();
        System.out.println(eCar.getInfo());
        eCar.charge();
        System.out.println();

        eBike.start();
        eBike.stop();
        System.out.println(eBike.getInfo());
        eBike.charge();
    }
}
