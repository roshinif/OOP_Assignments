public class CarDriver {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan");
        System.out.println("Car1 model: " + car1.getModel());
        System.out.println("Car1 speed: " + car1.getSpeed() + " km/h");
        System.out.println("Car1 fuel: " + car1.getFuel() + " liters\n");

        Car car2 = new Car("SUV", 70, 50);
        System.out.println("Car2 model: " + car2.getModel());
        System.out.println("Car2 speed: " + car2.getSpeed() + " km/h");
        System.out.println("Car2 fuel: " + car2.getFuel() + " liters\n");

        car2.accelerate();
        System.out.println("Car2 speed after accelerating: " + car2.getSpeed() + " km/h");
        System.out.println("Car2 fuel after accelerating: " + car2.getFuel() + " liters\n");

        car2.decelerate(20);
        System.out.println("Car2 speed after decelerating: " + car2.getSpeed() + " km/h");
    }
}
