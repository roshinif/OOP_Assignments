public class Car {
    private double speed;
    private double fuel;
    private String model;
    private double tankCapacity;

    public Car(String model) {
        this.model = model;
        this.tankCapacity = 50;  // default capacity
        this.fuel = tankCapacity;
        this.speed = 0;
    }

    public Car(String model, double tankCapacity, double initialSpeed) {
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.fuel = tankCapacity;
        this.speed = initialSpeed;
    }

    public void accelerate() {
        if (fuel > 0) {
            speed += 10;
            fuel -= 0.5;
        }
    }

    public void decelerate(int amount) {
        if (fuel > 0 && amount > 0) {
            speed -= amount;
            if (speed < 0) speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void refillTank() {
        fuel = tankCapacity;
    }

    public double getFuel() {
        return fuel;
    }
}
