public class VehicleDemo4 {


    interface Vehicle {
        void start();
        void stop();
        String getInfo();
        void calculateFuelEfficiency();
    }

    interface ElectricVehicle {
        void charge();
    }

    static abstract class AbstractVehicle implements Vehicle {
        String type;
        String fuel;
        double efficiency;

        AbstractVehicle(String type, String fuel, double efficiency) {
            this.type = type;
            this.fuel = fuel;
            this.efficiency = efficiency;
        }

        public void start() {
            System.out.println(type + " is starting...");
        }

        public void stop() {
            System.out.println(type + " is stopping...");
        }

        public void calculateFuelEfficiency() {
            System.out.println(type + " efficiency: " + efficiency);
        }
    }

    static class Car extends AbstractVehicle {
        Car(String fuel, double efficiency) {
            super("Car", fuel, efficiency);
        }

        public String getInfo() {
            return "Type: Car\nFuel: " + fuel;
        }
    }

    static class Motorcycle extends AbstractVehicle {
        Motorcycle(String fuel, double efficiency) {
            super("Motorcycle", fuel, efficiency);
        }

        public String getInfo() {
            return "Type: Motorcycle\nFuel: " + fuel;
        }
    }

    static class Bus extends AbstractVehicle {
        int capacity;

        Bus(String fuel, int capacity, double efficiency) {
            super("Bus", fuel, efficiency);
            this.capacity = capacity;
        }

        public String getInfo() {
            return "Type: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
        }
    }

    static class ElectricCar extends AbstractVehicle implements ElectricVehicle {
        ElectricCar(double efficiency) {
            super("Electric Car", "Electricity", efficiency);
        }

        public String getInfo() {
            return "Type: Electric Car\nFuel: " + fuel;
        }

        public void charge() {
            System.out.println("Electric Car is charging...");
        }

        public void calculateFuelEfficiency() {
            System.out.println(type + " efficiency: " + efficiency + " kWh/100km");
        }
    }

    static class ElectricMotorcycle extends AbstractVehicle implements ElectricVehicle {
        ElectricMotorcycle(double efficiency) {
            super("Electric Motorcycle", "Electricity", efficiency);
        }

        public String getInfo() {
            return "Type: Electric Motorcycle\nFuel: " + fuel;
        }

        public void charge() {
            System.out.println("Electric Motorcycle is charging...");
        }

        public void calculateFuelEfficiency() {
            System.out.println(type + " efficiency: " + efficiency + " kWh/100km");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Petrol", 15.0);
        Motorcycle bike = new Motorcycle("Gasoline", 60.0);
        Bus bus = new Bus("Diesel", 40, 5.0);
        ElectricCar eCar = new ElectricCar(18.0);
        ElectricMotorcycle eBike = new ElectricMotorcycle(10.0);

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        car.calculateFuelEfficiency();
        System.out.println();

        bike.start();
        bike.stop();
        System.out.println(bike.getInfo());
        bike.calculateFuelEfficiency();
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        bus.calculateFuelEfficiency();
        System.out.println();

        eCar.start();
        eCar.stop();
        System.out.println(eCar.getInfo());
        eCar.calculateFuelEfficiency();
        eCar.charge();
        System.out.println();

        eBike.start();
        eBike.stop();
        System.out.println(eBike.getInfo());
        eBike.calculateFuelEfficiency();
        eBike.charge();
    }
}
