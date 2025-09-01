public class VehicleDemo {

    interface Vehicle {
        void start();
        void stop();
        String getInfo();
    }

    static class Car implements Vehicle {
        private String fuel;
        private String color;

        public Car(String fuel, String color) {
            this.fuel = fuel;
            this.color = color;
        }

        @Override
        public void start() {
            System.out.println("Car is starting...");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopping...");
        }

        @Override
        public String getInfo() {
            return "Car Information:\nType: Car\nFuel: " + fuel + "\nColor: " + color;
        }
    }

    static class Motorcycle implements Vehicle {
        private String fuel;
        private String color;

        public Motorcycle(String fuel, String color) {
            this.fuel = fuel;
            this.color = color;
        }

        @Override
        public void start() {
            System.out.println("Motorcycle is starting...");
        }

        @Override
        public void stop() {
            System.out.println("Motorcycle is stopping...");
        }

        @Override
        public String getInfo() {
            return "Motorcycle Information:\nType: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
        }
    }

    static class Bus implements Vehicle {
        private String fuel;
        private int capacity;

        public Bus(String fuel, int capacity) {
            this.fuel = fuel;
            this.capacity = capacity;
        }

        @Override
        public void start() {
            System.out.println("Bus is starting...");
        }

        @Override
        public void stop() {
            System.out.println("Bus is stopping...");
        }

        @Override
        public String getInfo() {
            return "Bus Information:\nType: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
        }
    }

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Petrol", "Red");
        Vehicle motorcycle = new Motorcycle("Gasoline", "Black");
        Vehicle bus = new Bus("Diesel", 40);

        // Car
        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        // Motorcycle
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        // Bus
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo() + "\n");
    }
}
